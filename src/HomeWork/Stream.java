package HomeWork;

import praktika.StudentGroup;

import java.util.ArrayList;
import java.util.Iterator;

public class Stream implements Iterable<StudentGroup>{
    public ArrayList<StudentGroup> stream = new ArrayList<>();
    int id;

    @Override
    public Iterator<StudentGroup> iterator() {
        return stream.iterator();
    }
    public Stream(ArrayList<StudentGroup> groups, int id){
        super();
        this.stream = groups;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Stream №: " + id;
    }
}
