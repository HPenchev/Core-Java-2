package pair;

public class PairTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Pair first = new Pair("Pesho", "Gosho");
        Pair second = new Pair("Pesho", "Gosho");
        Pair third = new Pair("Pesho", "Mariika");
        
        System.out.println(first.equals(second));
        System.out.println(first.equals(third));
    }
}