import static org.junit.Assert.*;

import org.junit.Test;


public class FilePathReducerTest {

    @Test
    public void test() {
        assertEquals("/", FilePathReducer.reduceFilePath("/"));
        assertEquals("/", FilePathReducer.reduceFilePath("/srv/../"));
        assertEquals(
                "/srv/www/htdocs/wtf", 
                FilePathReducer.reduceFilePath("/srv/www/htdocs/wtf/"
                        ));
        assertEquals(
                "/srv/www/htdocs/wtf",
                FilePathReducer.reduceFilePath("/srv/www/htdocs/wtf"
                        ));
        assertEquals("/srv", FilePathReducer.reduceFilePath("/srv/./././././"));
        assertEquals("/etc/wtf", FilePathReducer.reduceFilePath("/etc//wtf/"));
        assertEquals("/", FilePathReducer.reduceFilePath("/etc/../etc/../etc/../"));        
        assertEquals("/", FilePathReducer.reduceFilePath("//////////////"));
        assertEquals("/", FilePathReducer.reduceFilePath("/../"));       
    }

}
