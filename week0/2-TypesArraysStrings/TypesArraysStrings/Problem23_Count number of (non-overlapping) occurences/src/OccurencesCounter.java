public class OccurencesCounter {

    public static void main(String[] args) {
        System.out.println(countOcurrences("da", "daaadaadada"));
    }
    
    public static int countOcurrences(String needle, String haystack) {
        return haystack.split(needle, -1).length - 1;                
    }
}