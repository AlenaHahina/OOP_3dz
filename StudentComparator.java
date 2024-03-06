package DZ_3_OOP;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student t1, Student t2) {
        return Double.compare(t1.getMarks(), t2.getMarks());
    }
}