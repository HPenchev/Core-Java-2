package fileUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class WordCountResult {
    private File file;
    
    public WordCountResult(File file) {
        this.file = file;
    }

    public int getLineCount() throws FileNotFoundException, IOException {
        int lines = 0;
        try(BufferedReader reader = new BufferedReader(new FileReader(this.file))) {
            while (reader.readLine() != null) {
                lines++;
            }
        }
        
        return lines;
    }
    
    public int getWordCount() throws FileNotFoundException {
        int count=0;
        try(Scanner sc = new Scanner(new FileInputStream(this.file))){            
            while(sc.hasNext()){
                sc.next();
                count++;
            }
        }
        
        return count;
    }
    
    public int getCharacterCount() throws FileNotFoundException, IOException {
        int numberOfCharacters = 0;
        try(FileReader reader = new FileReader(this.file)) {
            int characters = reader.read();
            while(characters != -1) {
                numberOfCharacters++;
                characters = reader.read();
            }
        }
        
        return numberOfCharacters;
    }
}
