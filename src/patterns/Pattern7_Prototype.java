package patterns;

public class Pattern7_Prototype  {
    public static void main(String[] args) throws CloneNotSupportedException {
        StudentPrototypes studentPrototypes = new StudentPrototypes();
        studentPrototypes.setStudent(new Student());

        Student student = studentPrototypes.getStudent();
    }


}

class Student implements Cloneable {
    @Override
    protected Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }
}

class StudentPrototypes {
    private Student student;

    public Student getStudent() throws CloneNotSupportedException {
        return student.clone();
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
