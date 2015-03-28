public class IsNPrime {

    public static void main(String[] args) {
        System.out.println(isPrime(1));
        System.out.println(isPrime(2));
        System.out.println(isPrime(5));
        System.out.println(isPrime(8));
        System.out.println(isPrime(9));
        System.out.println(isPrime(20));
    }
    
    public static boolean isPrime(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Only positive numbers can be prime");
        }
        
        if (n < 2) {
            return false;
        }
        
        double nSqrt = Math.sqrt(n);
        for (int i = 2; i <= nSqrt; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}