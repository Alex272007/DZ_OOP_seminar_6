public class Teacher extends User {
    private int teacherID;
    private String name ;
    
    public Teacher(String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.name = "Techer";
        teacherID++;
        
    }
    
    public int getTeacherID() {
        return teacherID;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        
        return "ID- " + teacherID + "; " + super.toString() + ": " + name ;
    }
    
}
