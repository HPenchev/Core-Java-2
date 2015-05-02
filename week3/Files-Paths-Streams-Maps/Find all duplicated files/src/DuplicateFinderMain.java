import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;


public class DuplicateFinderMain {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get(args[0]);
        DuplicatesFinder.findDuplicateFiles(path);
    }
}