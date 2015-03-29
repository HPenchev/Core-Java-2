import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {      
    
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.run();
    }
    
    public void run() {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Enter expression: ");
            String expression = input.nextLine();
            expression = expression.replace(" ", "");
            String result = calculateParanthesisExpression(expression);
            System.out.println(result);
        }        
    }
    
    public static String calculateParanthesisExpression(String expression) {
        Pattern p = Pattern.compile("\\([^\\(\\)]+\\)");
        Matcher m = p.matcher(expression);
        
        if (m.find()) {
            String subExpression = m.group();
            String nonParanthesisExpression = 
                    subExpression.substring(1, subExpression.length() - 1);
            expression =
                    expression.replace(
                            subExpression, 
                            calculateNonparanthesisExpression(nonParanthesisExpression)
                            );
            expression = calculateParanthesisExpression(expression);
        } else {
            expression = calculateNonparanthesisExpression(expression);
        }
        
        return expression;
    }
    
    public static String calculateNonparanthesisExpression(String expression) {
        Pattern p = Pattern.compile("(\\-?[\\d\\.]+)([\\*/])(\\-?[\\d\\.]+)");
        expression = calculateActions(expression, p);
        
        p = Pattern.compile("(\\-?[\\d\\.]+)([\\+\\-])(\\-?[\\d\\.]+)");
        expression = calculateActions(expression, p);
        
        return expression;
    }
    
    private static String calculateActions(String expression, Pattern p) {
        Matcher m = p.matcher(expression);
        if (m.find()) {
            String subExpression = m.group();
            expression = expression.replace(subExpression, calculateTwoNumbers(subExpression));
            expression = calculateActions(expression, p);
        } else {
            return expression;
        }
        
        return expression;
    }
    
    public static String calculateTwoNumbers(String expression) {
        
        Pattern p = Pattern.compile("(\\-?[\\d\\.]+)([\\+\\-\\*/])(\\-?[\\d\\.]+)");
        Matcher m = p.matcher(expression);
        m.find();        
        double firstNumber = Double.parseDouble(m.group(1));        
        double secondNumber = Double.parseDouble(m.group(3));
        double result = 0;
        
        switch(m.group(2)) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                result = firstNumber / secondNumber;
                break;
            default :
                throw new IllegalStateException("Operation can't be performed");
        }
        
        return Double.toString(result);
    }
}