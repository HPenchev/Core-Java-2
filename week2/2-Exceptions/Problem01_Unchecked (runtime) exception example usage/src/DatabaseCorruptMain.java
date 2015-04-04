
public class DatabaseCorruptMain {

    public static void main(String[] args) {        
        throwDatabaseCorruptedException();
    }
    
    public static void throwDatabaseCorruptedException() {
        throw new DatabaseCorruptedException();
    }
}
