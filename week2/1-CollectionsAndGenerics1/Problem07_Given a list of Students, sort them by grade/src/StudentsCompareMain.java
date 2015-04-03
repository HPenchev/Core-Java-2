import java.util.Arrays;


public class StudentsCompareMain {

    public static void main(String[] args) {
        Student pesho = new Student ("Petar Petrov", 5);
        Student gosho = new Student ("Georgi Ivanov", 5);
        Student mariika = new Student ("Maria Stoyanova", 6);
        Student[] students = {pesho, gosho, mariika};
        Arrays.sort(students, new StudentComparator());
        for (Student student : students) {
            System.out.println(student);
        }
    }
}