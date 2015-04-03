import java.util.Comparator;


public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student firstStudent, Student secondStudent) {        
        if (firstStudent.getGrade() == secondStudent.getGrade()) {
            return firstStudent.getName().compareTo(secondStudent.getName());
        } else {
            return firstStudent.getGrade() - secondStudent.getGrade();
        }
    }
}