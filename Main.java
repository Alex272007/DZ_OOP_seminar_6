public class Main {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        studentController.create("Иван", "Игоревич", "Лут");
        studentController.create("Марк", "Андреевич", "Куций");
        // studentController.printStudentList();

        ControllerTeacher controllerTeacher = new ControllerTeacher();
        controllerTeacher.create("Ирина", "Aндреевна", "Сидорова");
        controllerTeacher.create("Тарас", "Григорьевич", "Шевченко");
        // controllerTeacher.create("Алия", "Иосифовна", "Руть");
        controllerTeacher.printTeacherList();
        // controllerTeacher.modifyTeacher();
    }
}
