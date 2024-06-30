package praktika;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {
    public StringBuilder students = new StringBuilder();

    public void addStudent(Student student){
        students.append(student).append(" ");
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudenrGroupIterator(this);
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "students=" + students +
                '}';
    }
}
