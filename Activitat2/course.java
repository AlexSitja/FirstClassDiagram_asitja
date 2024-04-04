package Activitat2;

import java.util.List;

public class course {
    private List<Student> students;

    public course(List<Student> students) {
        this.students = students;
    }

    public int countStudents() {
        return students.size();
    }
}