import static org.junit.Assert.*;

import org.junit.Test;


public class StringJoinerTest {

    @Test
    public void test() {
        assertEquals("1 2 3 4 5", StringJoiner.stichMeUp(" ", 1, 2, 3, 4, 5));
        assertEquals
        (
                "���� ����� 5 ������ ������",
                StringJoiner.stichMeUp
                (       " ",               
                        "����", 
                        "�����",
                        5, 
                        "������", 
                        "������"
                        ));
    }

}
