import static org.junit.Assert.*;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;


public class CrawlerTest {

    @Test
    public void crawlTest() throws MalformedURLException, IOException {
        String expected = "http://ebusiness.free.bg/cards_bank_cards.html";
        String output = 
                WebsiteCrawler
                .crawl(
                        new URL("http://ebusiness.free.bg"), 
                        "Револвираща")
                .toString();
        
        assertEquals(expected, output);
    }

}
