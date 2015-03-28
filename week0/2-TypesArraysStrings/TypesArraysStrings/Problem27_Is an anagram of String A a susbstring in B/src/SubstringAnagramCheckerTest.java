import static org.junit.Assert.*;

import org.junit.Test;


public class SubstringAnagramCheckerTest {

    @Test
    public void testHasAnagramOf(){
        assertEquals(true, SubstringAnagramChecker.hasAnagramOf("abc", "cbadfghhijh"));
        assertEquals(true, SubstringAnagramChecker.hasAnagramOf("abcdef", "fedbcadh"));
        assertEquals(true, SubstringAnagramChecker.hasAnagramOf("dirac", "libcarid"));
        assertEquals(false, SubstringAnagramChecker.hasAnagramOf("abc", "cbda"));
    }
}