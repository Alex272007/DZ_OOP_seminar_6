### _class ControllerTeacher_

SRP - Каждый метод класса имеет одну ответственную операцию

В текущем коде имеются повторы (ввод ID преподавателя и обработка неверного ввода),можно создать отдельные методы для обработки ввода и проверки существования преподавателя по ID

### _interface InterfaceUserController_

SRP - определяет метод создания пользователя

ISP - определяет только необходимый метод, что упрощает его реализацию и позволяет избегать ненужных зависимостей

### _class Student_

SRP - отвечает только за управление данными студента и их сравнение

Класс Student наследует класс User, что позволяет использовать общие методы и свойства, уменьшает дублирование кода и улучшает структуру

### _class StudentController_

SRP - отвечает за управление данными студентов, предоставляя методы для создания и вывода списка студентов

Проверка на наличие студентов и получение максимального ID вынесены в отдельный блок кода, чтобы избежать дублирования

Инициализация объектов StudentGroup и UserView происходит в классе, что делает код более модульным

### _class StudentGroup_ 

SRP - отвечает только за управление списком студентов и предоставление итератора

ISP - принцип разделения интерфейса

DIP - использование интерфейса List вместо конкретного класса ArrayList для хранения списка студентов. Это делает код более гибким и позволяет легко менять реализацию списка

Методы addStudent и getStudentList предоставляют контролируемый доступ к списку студентов, что улучшает инкапсуляцию данных

### _class StudentGroupService_

SRP - отвечает только за предоставление сервисов для работы со списком студентов, таких как сортировка

### _class Teacher_

SRP - отвечает только за хранение и предоставление информации о преподавателе.

### _class User_

SRP - отвечает только за хранение и предоставление информации о пользователе

### _class UserComparator_

SRP - отвечает только за сравнение объектов типа User

OCP - метод compare удовлетворяет принципу открытости/закрытости , так как его легко можно модифицировать или расширить для добавления новых критериев сравнения без изменения существующего кода 

Использование структурированной проверки для сравнения позволяет избежать дублирования кода

### _class UserView_

SRP - отвечает за отображение пользовательских объектов на консоли в соответствии с SRP.

LSP - UserView параметризован типом T, который ограничен типом User. Метод sendOnConsole работает с объектами типа T, что соответствует обобщенной цели класса, позволяя работать с различными типами пользователей, сохраняя при этом одинаковый интерфейс.

### _class ViewTeacher_

LSP - переопределение метода sendOnConsole не добавляет нового поведения и не изменяет контракт, определенный в UserView