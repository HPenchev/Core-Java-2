package fileUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class FileUtils {
    private static FileUtils instance = null;
    
    private FileUtils() {}
    
    public static FileUtils getInstance() {
        if (instance == null) {
            instance = new FileUtils();
        }
        
        return instance;
    }
    
    public String readFrom(File file) throws FileNotFoundException, IOException {
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {                
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }    
            
            return sb.toString().trim();
        }
    }
    
    public String readFrom(Path path) throws FileNotFoundException, IOException {
        return this.readFrom(path.toFile());
    }
    
    public void writeTo(String text, File file) throws IOException {
        FileWriter fw = new FileWriter(file);
        
        try(BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(text);
        }
    }
    
    public Map<String, String> parseProperties(File file) 
            throws FileNotFoundException, IOException {
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            List<String> lines = new ArrayList<String>();
            String line = br.readLine();

            while (line != null) {                
                lines.add(line); 
                line = br.readLine();
                }    
            
            return this.parseElements(lines);
        }
    }
    
    public WordCountResult wordCount(File file) {
        return new WordCountResult(file);
    }
    
    public WordCountResult wordCount(Path path) {
        return this.wordCount(path.toFile());
    }
    
    public void fixEncoding(Path path) throws IOException {
        File file = path.toFile();        

        byte[] encoded = Files.readAllBytes(Paths.get(file.getAbsolutePath()));
//        try (BufferedWriter bw = 
//                new BufferedWriter(
//                        new OutputStreamWriter(new FileOutputStream(file), "UTF-8"))) {
//                                bw.write(new String(encoded, "Windows-1251"));
//       }
        
        StringBuilder builder = new StringBuilder();
        BufferedReader rd = null;
        try {
           rd = new BufferedReader(new InputStreamReader(new FileInputStream(file), "Windows-1251"));
           while(rd.readLine()!=null){
               builder.append(rd.readLine());
               builder.append(System.lineSeparator());
           }
        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            if (rd != null) {
                rd.close();
            }
        }

        BufferedWriter wr = 
                new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
        wr.write(builder.toString());      
    }
    
    
    public Path reduceFilePath(Path path) {
        return path.normalize();
    }    
    
    public void findBrokenFiles(Path path)  {
        File file = new File(path.toString());
        if (Files.isSymbolicLink(path) && file.isFile() && file.isDirectory()) {
            System.out.println(path);
        }
        else if (file.isDirectory()) {            
            String[] children = file.list(); 
            for (String child : children) {
                findBrokenFiles((new File(file, child)).toPath());
           } 
        }
    }
    
    public void compress(Path path) throws FileNotFoundException, IOException {
        String text = this.readFrom(path);
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(text);
        Map<String, String> words = new HashMap<String, String>();
        int counter = 0;
        while (matcher.find()) {
            String word = matcher.group();
            if (!words.containsKey(matcher.group())) {                
                words.put(matcher.group(), ("~" + counter));
                counter++;
            }
            
            text = text.replaceFirst(word, words.get(word));
        }
        
        File file = new File(path.toString());        
        this.writeTo(text, file);
        String name = file.getName();
        String newName = name.replaceFirst("[.][^.]+$", ".compr");
        File newFile = new File(newName);
        file.renameTo(newFile);
    }
         
    private Map<String, String> parseElements(List<String> elements) {
        Map<String, String> map = new HashMap<String, String>();
        for (String element : elements) {
            if (element.trim().charAt(0)=='#') {
                continue;
            }
            
            String[] pair = element.split("=", 2);
            map.put(pair[0].trim(), pair[1].trim());
        }
        
        return map;
    }
}