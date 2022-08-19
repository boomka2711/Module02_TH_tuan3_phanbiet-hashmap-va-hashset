import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("nam",20,"hn");
        Student student2 = new Student("hung",21,"hn");
        Student student3 = new Student("vinh",22,"hn");

        Map<Integer,Student> studentMap = new HashMap<Integer,Student>();

        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student1);

        for (Map.Entry<Integer,Student> students : studentMap.entrySet() ){
            System.out.println(students.toString());
        }

        System.out.println(".........Set");

        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);

        for (Student s : students){
            System.out.println(s.toString());
        }
    }
}
