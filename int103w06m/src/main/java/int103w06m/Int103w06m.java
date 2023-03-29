package int103w06m;

import collection.Group;
import human.Person;
import java.util.Comparator;
import java.util.function.Predicate;

public class Int103w06m {

    public static void main(String[] args) {
        //testPerson();
        //testGroup();
        assignment();
    }
    static void assignment() {
        var g = new Group<Person>();
        var p0 = new Person("One", "First");
        var p1 = new Person("Two", "Second");
        var p2 = new Person("Three", "Third");
        var p3 = new Person("Two", "First");
        var p4 = new Person("One", "Third");
        g.add(p3); g.add(p2); g.add(p0); g.add(p4); g.add(p1);
        //1.write a lambda expression to find a person with even-number id
        //2.write a lambda expression to find a person with lastname not ending with "l" 
        //  or firstname not containing "n"
        //3.write a lambda expression for sorting a group of persons by reversed firstname 
        //  and then by natural order.
        
    }
    static void testPerson() {
        var p = new Person("First", "Last");
        System.out.println("Person: " + p);
        p.setFirstname("NewFirstname");
        System.out.println("Person: " + p);
    }
    private static Predicate<Person> findLastnameContaining(String s) {
        return p->p.getLastname().contains(s);
    }
    static void testGroup() {
        var g = new Group<Person>();
        var p0 = new Person("First","Last");
        var p1 = new Person("One","Final");
        var p2 = new Person("End","Terminal");
        var p4 = new Person("First","Final");
        g.add(p2); g.add(p0); g.add(p1); g.add(p4);
        System.out.println("Group: " + g);
        System.out.println("Find Person Lastname containing m : " + g.find(findLastnameContaining("m")));
        Predicate<Person> fn = p -> p.getFirstname().contains("r");
        Predicate<Person> ln = p -> p.getLastname().contains("e");
        System.out.println("Find Person Firstname no r and Lastname no e: " + g.find(fn.negate().and(ln.negate())));
        System.out.println("Original: " + g);
        System.out.println("Sorted: " + g.sort());
        Comparator<Person> sortedFirstname = (px, py) -> px.getFirstname().compareTo(py.getFirstname());
        Comparator<Person> sortedLastname = (px, py) -> px.getLastname().compareTo(py.getLastname());
        g.sort(sortedFirstname.reversed());
        System.out.println("Sorted by Firstname: " + g);
        g.sort(Comparator.naturalOrder());
        System.out.println("Sorted - natural order: " + g);
        System.out.println("Sorted by Firstname, then Lastname: " 
                + g.sort(sortedFirstname.thenComparing(sortedLastname)));
        //Comparator<Person> lastnameFunc = Comparator.comparing(p -> p.getLastname());
        Comparator<Person> lastnameFunc = Comparator.comparing(Person::getLastname);
        System.out.println("Sorted by Lastname: " + g.sort(lastnameFunc));
        
    }
}
