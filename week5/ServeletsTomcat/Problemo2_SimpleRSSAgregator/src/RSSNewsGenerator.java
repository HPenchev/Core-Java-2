
import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.syndication.feed.synd.SyndEntry;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.FeedException;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;

@WebServlet("/RSSNewsGenerator")
public class RSSNewsGenerator extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String HTML_START="<html><body>";
    public static final String HTML_END="</body></html>";
    
    public RSSNewsGenerator() {
        super();
        // TODO Auto-generated constructor stub
    }	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        URL bulgariaNews = new URL("http://www.dnevnik.bg/rssc/?rubrid=1657");
        URL technologyNews = new URL("http://www.dnevnik.bg/rssc/?rubrid=1660");
        URL sportNews = new URL("http://www.dnevnik.bg/rssc/?rubrid=1692");
        
        HttpURLConnection bulgaiaNewsConnection = 
                (HttpURLConnection)bulgariaNews.openConnection();
        
        HttpURLConnection technologyNewsConnection = 
                (HttpURLConnection)technologyNews.openConnection();
        
        HttpURLConnection sportNewsConnection = 
                (HttpURLConnection)sportNews.openConnection();
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println(HTML_START);
        rssPrint(bulgaiaNewsConnection, out);  
        rssPrint(technologyNewsConnection, out);
        rssPrint(sportNewsConnection, out);
        out.println(HTML_END);
    }

    private void rssPrint(HttpURLConnection connection, PrintWriter out) 
            throws IOException {
        SyndFeedInput input = new SyndFeedInput();
        SyndFeed feed = null;
        try {
            feed = input.build(new XmlReader(connection));
        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (FeedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        List entries = feed.getEntries();
        Iterator itEntries = entries.iterator();
 
        out.println("<section>");
        while (itEntries.hasNext()) {
            StringBuilder output = new StringBuilder("<article>");
            SyndEntry entry = (SyndEntry) itEntries.next();
            
            output.append("<h1>" + entry.getTitle() + "</h1>");
            
            output.append(
                    "<span>" +
            entry.getDescription().getValue());
            output.append(
                    "<a href = '" + 
            entry.getLink() + 
            "'> прочети повече</a></span>");
            output.append("</article>");
            out.println(output.toString());
        }
        
        out.println("</section>");
    }
}