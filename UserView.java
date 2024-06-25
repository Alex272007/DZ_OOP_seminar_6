import java.util.List;

public class UserView<T extends User> {

    public void sendOnConsole(List<T> users) {
        for(T us : users){
            System.out.println(us);
        }
    }
}
