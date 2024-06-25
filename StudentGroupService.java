import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentGroupService {
    private StudentGroup studentGroup;

    public StudentGroupService(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public List<Student>getSortedStudentGroup(){
        List<Student>studentsList = new ArrayList<>(studentGroup.getStudentList());
        Collections.sort(studentsList);
        return studentsList;
    }

    public List<Student> getSortedByFIO(){
        List<Student>studentsList = new ArrayList<>(studentGroup.getStudentList());
        studentsList.sort(new UserComparator<Student>());
        return studentsList;
    }
}