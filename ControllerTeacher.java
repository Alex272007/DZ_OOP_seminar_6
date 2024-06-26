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

    private int getTeacherIdInput(String message) {
        System.out.println(message);
        return scanner.nextInt();
    }

    private Teacher findTeacherById(int id) {
        for (Teacher teacher : list) {
            if (teacher.getTeacherID() == id) {
                return teacher;
            }
        }
        return null;
    }

    public void modifyTeacher() {
        int id = getTeacherIdInput("Введите id преподавателя, которого хотите изменить: ");
        scanner.nextLine();

        Teacher teacher = findTeacherById(id);
        if (teacher != null) {
            System.out.println("Введите фамилию преподавателя: ");
            teacher.setLastName(scanner.nextLine());

            System.out.println("Введите имя преподавателя: ");
            teacher.setFirstName(scanner.nextLine());

            System.out.println("Введите отчество преподавателя: ");
            teacher.setSecondName(scanner.nextLine());

            System.out.println("Преподаватель изменен: " + teacher);
        } else {
            System.out.println("Такого преподавателя нет, попробуйте еще раз");
            modifyTeacher();
        }
    }

    public void removeTeacher() {
        printTeacherList();
        int id = getTeacherIdInput("Введите id преподавателя: ");

        Teacher teacher = findTeacherById(id);
        if (teacher != null) {
            list.remove(teacher);
            System.out.println("Преподаватель удален");
        } else {
            System.out.println("Такого преподавателя нет, попробуйте еще раз");
            removeTeacher();
        }
    }

    public void printTeacherList() {
        for (Teacher teacher : list) {
            System.out.println(teacher);
        }
    }
}
