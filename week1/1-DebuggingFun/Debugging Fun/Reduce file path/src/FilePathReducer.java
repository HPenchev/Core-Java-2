import java.util.regex.Pattern;


public class FilePathReducer {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }
    
    public static String reduceFilePath(String filePath) {
        String stringPattern = "/\\./";
        String replacer = "/";
        filePath = reformatFilePath(filePath, stringPattern, replacer);  
        
        stringPattern = "//";
        filePath = reformatFilePath(filePath, stringPattern, replacer); 
        
        stringPattern = "[^/]+/\\.\\./";
        replacer = "";
        filePath = reformatFilePath(filePath, stringPattern, replacer);
        
        stringPattern = "^/\\.\\./";
        replacer = "/";
        filePath = reformatFilePath(filePath, stringPattern, replacer);
        
        if (filePath.length() > 1) {
            stringPattern = "/$";
            replacer = "";
            filePath = reformatFilePath(filePath, stringPattern, replacer);
        }
        
        return filePath;
    }

    private static String reformatFilePath(
            String filePath,
            String stringPattern, 
            String replacer) {
        Pattern pattern = Pattern.compile(stringPattern);               
        
        while(pattern.matcher(filePath).find()) {
            filePath = filePath.replaceAll(stringPattern, replacer);
        }
        
        return filePath;
    }

}
