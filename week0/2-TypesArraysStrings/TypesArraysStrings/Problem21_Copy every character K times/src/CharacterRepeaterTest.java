import static org.junit.Assert.*;

import org.junit.Test;


public class CharacterRepeaterTest {

    @Test
    public void testCopyCharacter(){
        assertEquals("aaa", CharacterRepeater.copyEveryChar("a", 3));
        assertEquals("aabbaadd", CharacterRepeater.copyEveryChar("abad", 2));
        assertEquals("WWhhaatt  tthhee  hheellll", CharacterRepeater.copyEveryChar("What the hell", 2));
    }

}