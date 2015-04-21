package fileUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;


public class FileUtilsMain {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("lost.s04e11.hdtv.xvid-2hd.str");
        FileUtils util = FileUtils.getInstance();
        util.fixEncoding(file.toPath());
    }
}