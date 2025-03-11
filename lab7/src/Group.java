import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(String name) {
        students.removeIf(s -> s.name.equalsIgnoreCase(name));
    }

    public List<Student> findTopStudents(double threshold) {
        return students.stream().filter(s -> s.averageGrade > threshold).toList();
    }
}
