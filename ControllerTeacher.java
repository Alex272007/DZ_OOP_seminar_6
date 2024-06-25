import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ControllerTeacher implements InterfaceUserController<Teacher> {

    private Scanner scanner = new Scanner(System.in);
    UserView<Teacher> userView = new UserView<>();
    private List<Teacher> list = new ArrayList<>();

    @Override
    public void create(String firstName, String secondName, String lastName) {
        Teacher teacher = new Teacher(firstName, secondName, lastName);
        list.add(teacher);
    }

   
    public void modifyTeacher() {
        System.out.println("Введите id преподавателя, которого хотите изменить: ");
        int consol = scanner.nextInt();
        scanner.nextLine();
        for (Teacher teacher : list) {
            if (teacher.getTeacherID() == consol) {
                System.out.println("Введите фамилию преподавателя: ");
                String fName = scanner.nextLine();
                teacher.setLastName(fName);
                System.out.println("Введите имя преподавателя: ");
                String name = scanner.nextLine();
                teacher.setFirstName(name);
                System.out.println("Введите отчество преподавателя: ");
                String secondName = scanner.nextLine();
                teacher.setSecondName(secondName);
                System.out.println("Преподаватель изменен: " + teacher);
                return;
            }
        }
        System.out.println("Такого преподавателя нет, попробуйте еще раз");
        modifyTeacher();
    }

    public void removeTeacher(){
        printTeacherList();
        System.out.println("Введите id преподавателя: ");
        int consol = scanner.nextInt();
            for (int i = 0; i < list.size(); i++){
                if (list.get(i).getTeacherID() == consol){
                    list.remove(i);
                    System.out.println("Преодаватель удален");

                    return;
                }
             }
        System.out.println("Такого преподавателя нет, попробуйте еще раз");
        removeTeacher();
    }

    public void printTeacherList(){
        for (Teacher teacher : list) {
            System.out.println(teacher);

        }
    }
}