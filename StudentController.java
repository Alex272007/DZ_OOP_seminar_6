import java.util.ArrayList;

public class StudentController implements  InterfaceUserController<Student>{

    StudentGroup studentGroup = new StudentGroup(new ArrayList<>());
    UserView<Student> userView = new UserView<>();

    @Override
    public void create(String name, String secondName, String lastName) {
        int maxId = 0;
        if(!studentGroup.getStudentList().isEmpty())
            maxId = studentGroup.getStudentList().get(studentGroup .getStudentList().size()-1).getStudentID()+1;
        Student student = new Student(maxId, lastName, secondName, lastName);
        studentGroup.addStudent(student);
    }

    public void printStudentList(){
        userView.sendOnConsole(studentGroup.getStudentList());
    }

}
