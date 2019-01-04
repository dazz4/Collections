package lists;

import java.util.LinkedList;
import java.util.Spliterator;

class User {

    String firstName;
    String userName;
    String password;
    int age;

    public User(String firstName, String userName, String password, int age) {
        this.firstName = firstName;
        this.userName = userName;
        this.password = password;
        this.age = age;
    }

    @Override
    public String toString() {
        return firstName + "\n" + userName + "\n" + password + "\n" + age;
    }
}

public class UserDefinedClasses {

    public static void main(String[] args) {

        LinkedList<User> users = new LinkedList<>();

        users.add(new User("Darek", "dazz", "kwidzyn", 29)); // create a new user and add it to the list
        users.add(new User("Kasia", "kasiek", "keeper", 36));
        users.add(new User("Dawid", "dawidos", "art", 40));

        Spliterator<User> split = users.spliterator(); // create a spliterator
        split.forEachRemaining((n) -> System.out.println(n + "\n")); // display content using forEachRemaining and lambda

    }

}
