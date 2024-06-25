public class Student extends User implements Comparable<Student> {

    private int studentID;

    public Student(int studentID, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    }


    @Override
    public int compareTo(Student o) {
        // if(studentID > o.studentID)return 1;
        // if (studentID < o.studentID)return -1;
        return Integer.compare(studentID, o.studentID);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Student [studentID= " + studentID + "]";
    }
}
