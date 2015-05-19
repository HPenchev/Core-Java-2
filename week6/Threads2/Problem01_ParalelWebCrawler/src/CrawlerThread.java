import java.io.IOException;
import java.net.URL;


public class CrawlerThread extends Thread {
    private WebsiteCrawler crawler;
    private URL url;
    private String needle;
    public URL result = null;
    
    public CrawlerThread(WebsiteCrawler crawler, URL url, String needle) {
        this.crawler = crawler;
        this.url = url;
        this.needle = needle;
    }
    
    @Override
    public void run() {
        while(WebsiteCrawlerMain.result == null) {
            try {
                this.result = this.crawler.crawl(url, needle);
                if (WebsiteCrawlerMain.result == null) {
                    WebsiteCrawlerMain.result = this.result;
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }  
}