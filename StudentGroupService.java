import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Интерфейс для стратегии сортировки
interface SortingStrategy<T> {
    List<T> sort(List<T> items);
}

// Реализация сортировки по ID
class SortByID implements SortingStrategy<Student> {
    @Override
    public List<Student> sort(List<Student> students) {
        List<Student> sortedList = new ArrayList<>(students);
        Collections.sort(sortedList);
        return sortedList;
    }
}

// Реализация сортировки по FIO
class SortByFIO implements SortingStrategy<Student> {
    @Override
    public List<Student> sort(List<Student> students) {
        List<Student> sortedList = new ArrayList<>(students);
        sortedList.sort(new UserComparator<>());
        return sortedList;
    }
}

public class StudentGroupService {
    private final StudentGroup studentGroup;

    public StudentGroupService(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public List<Student> getSortedStudentGroup(SortingStrategy<Student> strategy) {
        return strategy.sort(studentGroup.getStudentList());
    }
}
