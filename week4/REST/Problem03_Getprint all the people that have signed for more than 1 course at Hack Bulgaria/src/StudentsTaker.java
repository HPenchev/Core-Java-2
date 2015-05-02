
import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.sun.javafx.collections.MappingChange.Map;

public class StudentsTaker {

    public static void main(String[] args) throws ClientProtocolException, IOException, JSONException {
        String studentsUrl = "https://hackbulgaria.com/api/students/";
        String content = getStudents(studentsUrl);       
        JSONArray students = new JSONArray(content);
        Set<String> studentsOnMultipleCourses = countCourses(students);
        for (String student : studentsOnMultipleCourses) {
            //System.out.println(student);            
        }
        
        studentsUrl = "https://hackbulgaria.com/api/checkins/";
        content = getStudents(studentsUrl);
        students = new JSONArray(content);
        TreeMap<String, Integer> visits = countVisits(students);
        for (Entry<String, Integer> entry : visits.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    
    private static String getStudents(String url) throws ClientProtocolException, IOException {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpget = new HttpGet(url);
        CloseableHttpResponse response = httpclient.execute(httpget);
        try {
            HttpEntity entity = response.getEntity();
            String result = EntityUtils.toString(entity);              
            return result;        
        } finally {
            response.close();
        }
    }
    
    private static Set<String> countCourses(JSONArray students) throws JSONException {
        Set<String> studentsOnMultipleCourses = new HashSet<String>();
        
        String name;
        for (int i = 0; i < students.length(); i++) {
            JSONObject student = (JSONObject) students.get(i);
            name = (String) student.get("name");
            
            JSONArray courses = (JSONArray) student.get("courses");
                        
            if (courses.length() > 1) {
                studentsOnMultipleCourses.add(name);
            }            
        }

        return studentsOnMultipleCourses;
    }

    private static TreeMap<String, Integer> countVisits(JSONArray visits) throws JSONException {
        HashMap<String, Integer> visitsCount = new HashMap<String, Integer>();
        System.out.println(visits.length());
        String name;
        for (int i = 0; i < visits.length(); i++) {
            JSONObject visit = (JSONObject) visits.get(i);
            name = (String) visit.get("student_name");            
                        
            if (visitsCount.containsKey(name)) {
                visitsCount.put(name, visitsCount.get(name) + 1);
            } else {
                visitsCount.put(name, 1);
            }
        }
        
        ValueComparator comparator =  new ValueComparator(visitsCount);
        TreeMap<String, Integer> sortedVisitsCount = new TreeMap<String, Integer>(comparator);
        sortedVisitsCount.putAll(visitsCount);
        return sortedVisitsCount;
    }
}
