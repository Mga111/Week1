import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Person {
    public Person(String first) {
        // forgot that we hadn't gotten to implementing Student yet,
        // so it isn't super, but rather just our overloaded constructor, which we
        // would need to call, as demonstrated below.
        // Note: the readings next week talk much more about how Java syntax around
        //       classes works in Section 1.8
        this("noUtorID", first, new LinkedList<>(), "LAST");
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
        this.middle = new LinkedList<>(middle); // updated to avoid aliasing issue
        this.last = last;
    }

    public static void main(String[] args) {

        Person p = new Person("u", "first",
                new ArrayList<>(), "last");

        System.out.println(p);

        // TODO: add some more code which demonstrates the functionality
        //       of each piece of code that we write.
    }

    // TODO: override the toString method for the Person class

    // TODO: add the implmentations of our changeNames method

    // TODO: define a Student class which is a subclass of Person

    // TODO: create the University class

    // TODO: revisit the specification and see if there is anything else we might add or change
}
