import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

       studentList();
    }

    public static void arrayList() {

        List<String> stringList = new ArrayList<>();

        stringList.add("ABC");
        stringList.add("DEF");
        stringList.add("random");


        for(int i=0; i<stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }

        for (String element : stringList) {
            System.out.println(element);
        }

    }

    public static void numList() {
        List<Integer> numList = Arrays.asList(14, 8 , 13, 4);

        Collections.sort(numList);

        System.out.println(numList);
    }

    public static void studentList() {

        Student student1 = new Student(23, "Joseph");
        Student student2 = new Student(3, "Rane");
        Student student3 = new Student(33, "Zack");


        List<Student> students = Arrays.asList(student1, student2, student3);

        Comparator<Student> comparator = new StudentIdComparator();

        Collections.sort(students, comparator);

        for (var student : students) {
            System.out.println(student);
        }
    }
}