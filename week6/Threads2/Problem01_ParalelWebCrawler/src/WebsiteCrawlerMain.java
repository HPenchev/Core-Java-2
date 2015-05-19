import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;


public class WebsiteCrawlerMain {
    public static URL result;
    

    public static void main(String[] args) throws MalformedURLException, IOException, InterruptedException {
        WebsiteCrawler crawler = new WebsiteCrawler();
        URL url = new URL("http://9gag.com");
        String needle = "Револвираща";
        //URL url = crawler.crawl(new URL("http://9gag.com"), "Револвираща");
        
        CrawlerThread threadOne = new CrawlerThread(crawler, url, needle);
        CrawlerThread threadTwo = new CrawlerThread(crawler, url, needle);
        CrawlerThread threadThree = new CrawlerThread(crawler, url, needle);
        CrawlerThread threadFour = new CrawlerThread(crawler, url, needle);
        
        threadOne.start();
        threadTwo.start();
        threadThree.start();
        threadFour.start();
        
        threadOne.join();
        threadTwo.join();
        threadThree.join();
        threadFour.join();
        
        //System.out.println(result);
    }

}
