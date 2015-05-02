import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;


public class WebsiteCrawlerMain {
    
    

    public static void main(String[] args) throws MalformedURLException, IOException {
        URL url = WebsiteCrawler.crawl(new URL("http://ebusiness.free.bg"), "Револвираща");
        
        System.out.println(url);
    }

}
