
public class StringJoiner {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public static String stichMeUp(String glue, Object... elements) {
        StringBuilder builder = new StringBuilder();
        int length = elements.length;
        
        for (int i = 0; i < length; i++) {
            builder.append(elements[i].toString());
            if (i < length - 1) {
                builder.append(glue);
            }
        }
        
        return builder.toString();
    }
}
