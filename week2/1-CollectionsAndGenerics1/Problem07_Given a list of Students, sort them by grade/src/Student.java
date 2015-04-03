
public class Student {
    private String name;
    private int grade;    
    
    public Student(String name) {
        setName(name);        
    }
    
    public Student(String name, int grade) {
        this(name);
        setGrade(grade);
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        if(name == null || name.isEmpty()) {
            throw new IllegalArgumentException("String is mandatory");
        }
        
        this.name = name;
    }
    
    public int getGrade() {
        return grade;
    }
    
    public void setGrade(int grade) {
        if (grade < 2 || grade > 6) {
            throw new IllegalArgumentException("Grade has to be between 2 and 6");
        }
        
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", grade=" + grade + "]";
    }    
}