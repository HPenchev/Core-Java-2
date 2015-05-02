import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class WebsiteCrawler {
        
    public static URL crawl(URL url, String needle) throws IOException {
        Set<URL> checkedURL = new HashSet<URL>();
        URL result = crawlContent(url, needle, checkedURL, url.toString());        
        
        return result;
    }
    
    private static URL crawlContent(URL url, String needle, Set<URL> checkedURLs, String startUrl) 
            throws IOException {
        String urlContent = getUrlContentAsString(url);
        checkedURLs.add(url);
        
        if (urlContent.contains(needle)) {
            return url;
        } else {        
            List<String> children = getAllLinks(urlContent);       
        
            URL result;
            URL newUrl;
            for (String childUrl : children) {
                if (childUrl.startsWith("http") || childUrl.startsWith("www.")) {
                    continue;
                }
                childUrl = childUrl.replace("..", "");
                String encodedChildUrl = startUrl + "/" + childUrl; //URLEncoder.encode(childUrl, "UTF-8");
                newUrl = new URL(encodedChildUrl);
                
                if (checkedURLs.contains(newUrl)) {
                    continue;
                }
                
                result = crawlContent(newUrl, needle, checkedURLs, startUrl);
                
                if (result != null) {
                    return result;
                }
            }
            
            return null;
        }
    }
    
    private static  String getUrlContentAsString(URL url) throws IOException {
        
        BufferedReader in = new BufferedReader(
        new InputStreamReader(url.openStream(), "UTF-8"));

        StringBuilder html = new StringBuilder();
        String inputLine;
        while ((inputLine = in.readLine()) != null)
            html.append(inputLine);
            html.append(System.lineSeparator());
        in.close();
    
    return html.toString();
    }
    
    private static List<String> getAllLinks(String content) {
        ArrayList<String> resultList = new ArrayList<>();
        String regex = "<a.*?href=\"((?!javascript).*?)\".*?>";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            resultList.add(matcher.group(1));
        }
        
        return resultList;
    }
}
