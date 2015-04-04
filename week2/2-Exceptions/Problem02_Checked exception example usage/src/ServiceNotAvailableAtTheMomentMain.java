
public class ServiceNotAvailableAtTheMomentMain {
    public static void main(String args[]) {
        try {
            throwServiceNotAvailableAtTheMomentException();
        } catch (ServiceNotAvailableAtTheMomentException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void throwServiceNotAvailableAtTheMomentException() throws ServiceNotAvailableAtTheMomentException {
        throw new ServiceNotAvailableAtTheMomentException("No internet connection");
    }
}