
public class BracketsChecker {
    
    public static void main(String args[]) {
        String expression = "((3 + 5) * 3 - )";
        System.out.println(checkBrackets(expression));
        expression = "()()())))((())(";
        System.out.println(checkBrackets(expression));
        System.out.println(checkBrackets("())(()"));
    }
    
    public static boolean checkBrackets(String expression) {
        expression = expression.replaceAll("[^\\(\\)]", "");
        int length = expression.length();
        if (expression.charAt(0) == ')' || expression.charAt(length - 1) == '(') {
            return false;
        }
        
        int openBrackets = 0;
        int closeBrackets = 0;
        
        for (int i = 0; i < length; i++) {
            if (expression.charAt(i) == '(') {
                openBrackets++;
            } else {
                closeBrackets++;
            }
            
            if(closeBrackets > openBrackets) {
                return false;
            }
        }
        
        return closeBrackets == openBrackets;
    }
}
