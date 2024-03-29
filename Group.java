package DZ_3_OOP;
// — Создать класс Поток, содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable;
// — Создать класс StreamComparator, реализующий сравнение количества групп, входящих в Поток;
// — Модифицировать Comparator для студента таким образом, что бы была возможность сравнения оценок 
// студентов(предвадительно необходимо добавить соотвествующее поле в Student)
import java.util.ArrayList;
import java.util.Iterator;

public class Group implements Iterable<Student>{
    private final String name;
    private ArrayList<Student> students;

    public Group(String name, ArrayList<Student> students) {
        this.name = name;
        this.students = students;
    }

    public Group(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public Iterator<Student> iterator() {
        return new GroupIterator(students);
    }

    @Override
    public String toString() {
        return "Group{" 
                 + name  +
                " students=" + students +
                '}';
    }
}