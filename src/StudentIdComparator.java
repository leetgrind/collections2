import java.util.Comparator;

public class StudentIdComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        // return 0 if they are equal
        // negative number if o1 < o2
        // positive number if 01 > o2
        return o1.getId() - o2.getId();
    }
}
