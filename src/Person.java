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
    private String last;

    public Person(String utorID, String first, List<String> middle, String last) {
        this.utorID = utorID;
        this.first = first;
        this.middle = new LinkedList<>(middle); // updated to avoid aliasing issue
        this.last = last;
    }

    public static void main(String[] args) {

        Person p = new Person("u", "first",
                new ArrayList<>(), "last");
        System.out.println(p.getUtorID());
        System.out.println(p);

        // TODO: add some more code which demonstrates the functionality
        //       of each piece of code that we write.
    }

    // DONE: used right-click Generate... toString() and chose the String concat template
    // TODO: see if we can format this better!
    @Override
    public String toString() {
        return "Person{" +
                "utorID='" + utorID + '\'' +
                ", first='" + first + '\'' +
                ", middle=" + middle +
                ", last='" + last + '\'' +
                '}';
    }

    public void changeNames(String name){
        this.first = name;
    }
    public void changeNames(String name , List<String> middles, String lasts){
        this.first = name;
        this.last = lasts;
        this.middle = new LinkedList<>(middles);
    }
    // TODO: add the implmentations of our changeNames method
}
    // TODO: define a Student class which is a subclass of Person
public class Student extends Person{

    private int studentID;
    private List<Course> courses;

    public Student(String utorID, String first, List<String> middle, String last, int studentID) {
        super(utorID, first, middle, last);
        this.studentID = studentID;
    }

    public Student(String first, int studentID) {
        super(first);
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Person{" +
                "utorID='" + utorID + '\'' +
                ", first='" + first + '\'' +
                ", middle=" + middle +
                ", last='" + last + '\'' +
                "studentID='" + String.valueOf(studentID) + '\'' +
                '}';
    }
    public void payFees(){

    }

    public void displayName(){
        System.out.println(first);
    }

}
    // TODO: create the University class

    // TODO: revisit the specification and see if there is anything else we might add or change

