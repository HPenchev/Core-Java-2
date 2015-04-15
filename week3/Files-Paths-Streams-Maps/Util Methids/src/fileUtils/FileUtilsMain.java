package fileUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;


public class FileUtilsMain {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        //File file = new File("test.txt");
//        file.createNewFile();
        FileUtils utils = FileUtils.getInstance();
//        Path path = (Path) FileSystems.getDefault().getPath("lost.s04e11.hdtv.xvid-2hd.str");
//        utils.fixEncoding(path);
//        Path path = (Path) FileSystems.getDefault().getPath("folder");
//        utils.findBrokenFiles(path);   
        Path path = (Path) FileSystems.getDefault().getPath("test.txt");
        utils.compress(path);
        //System.out.println(path);
    }
}