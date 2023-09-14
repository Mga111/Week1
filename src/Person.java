import java.util.ArrayList;
import java.util.List;

public class Person {

    String first;
    String[] middle;
    String last;

    public Person(String first, String[] middles, String last) {
        this.first = first;
        middle = middles;
        this.last = last;
    }

    public static void main(String[] args) {

        Person p = new Person("first", new String[]{"middle"}, "last");

        // TODO: change the right-hand-side type to Person below
        //       IntelliJ will complain: hover the red
        //       squiggly and click More actions...
        //       then click Make 'Student' extend 'Person'
        //       After, you can continue developing the code!
        Student s = new Student();

        // TODO: try printing the student and have it also print their
        //       student number (hint: you'll need to override toString
        //       and extend its behaviour (so still call its super version
        //       of toString). Section 1.8 of the notes has a section about
        //       overriding methods you can refer to.

        // TODO: try to implement the rest of our design!

        // TODO: look back at the specification and see what we are missing,
        //       then update the design and implement the changes.

        System.out.println(p);

    }

    @Override
    public String toString() {
        return first + middle[0] + last;
    }
}
