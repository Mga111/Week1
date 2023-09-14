import java.util.ArrayList;
import java.util.List;

public class Person {
    public Person(String first) {
        // TODO: call super constructor
        //super(
    }

    public String getUtorID() {
        return utorID;
    }

    private String utorID;
    private String first;
    private List<String> middle;

    String last;

    public Person(String utorID, String first, List<String> middle, String last) {
        this.utorID = utorID;
        this.first = first;
        this.middle = middle;
        this.last = last;
    }

    public static void main(String[] args) {
        Person p = new Person("u", "first",
                new ArrayList<>(), "last");

        System.out.println(p);
    }
}
