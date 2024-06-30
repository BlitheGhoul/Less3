import HomeWork.Stream;
import HomeWork.StreamService;
import praktika.StudenrGroupIterator;
import praktika.Student;
import praktika.StudentComparator;
import praktika.StudentGroup;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StudentGroup studentGroup1 = new StudentGroup();
        Student ivan = new Student("Ivan", 11);
        Student andrei = new Student("Andrei", 8);
        Student alex = new Student("Alexandr", 3);

        studentGroup1.addStudent(ivan);
        studentGroup1.addStudent(andrei);
        studentGroup1.addStudent(alex);

        StudentGroup studentGroup2 = new StudentGroup();
        Student anton = new Student("Anton", 12);
        Student olesya = new Student("Olesya", 9);
        Student arnold = new Student("Arnold", 4);

        studentGroup2.addStudent(anton);
        studentGroup2.addStudent(olesya);
        studentGroup2.addStudent(arnold);

        StudentGroup studentGroup3 = new StudentGroup();
        Student sergei = new Student("Sergei", 10);
        Student ludmila = new Student("Ludmila", 7);
        Student afanasiy = new Student("Afanasiy", 5);

        studentGroup3.addStudent(sergei);
        studentGroup3.addStudent(ludmila);
        studentGroup3.addStudent(afanasiy);

        StudentGroup studentGroup4 = new StudentGroup();
        Student timon = new Student("Timon", 16);
        Student pumba = new Student("Pumba", 2);
        Student simba = new Student("Simba", 71);
        Student mako = new Student("Mako", 71);

        studentGroup4.addStudent(timon);
        studentGroup4.addStudent(pumba);
        studentGroup4.addStudent(simba);


        Stream stream1 = new Stream( new ArrayList<>(List.of(studentGroup3)), 1);

        System.out.println(stream1);

        Stream stream2 = new Stream( new ArrayList<>(List.of(studentGroup2, studentGroup4, studentGroup1)), 2);


        ArrayList<Stream> streams = new ArrayList<>(List.of(stream1,stream2));
        System.out.println(streams);

        StreamService streamService = new StreamService(streams);
        System.out.println(streamService.SortAscending());
        System.out.println(streamService.SortDescending());


        //Iterator<Student> iterator = new StudenrGroupIterator(studentGroup1);
        //System.out.println(studentGroup.students);

        //while (iterator.hasNext()){
          //  System.out.println(iterator.next());
        //}

       // for (Student student: studentGroup){
       //     System.out.println(student);
       // }
        //ArrayList<Student> arrayList = new ArrayList<>(List.of(ivan, andrei, alex));
       // System.out.println(arrayList);

        //Collections.sort(arrayList, (s1, s2) -> s1.id - s2.id);
        //System.out.println(arrayList);
    }
}