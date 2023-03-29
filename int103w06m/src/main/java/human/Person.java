package human;

import tools.Util;

public class Person implements Comparable<Person> {
    private static int nextId;
    private final int id;
    private String firstname;
    private String lastname;

    
    public Person(String firstname, String lastname) {
        this.firstname = Util.isValid(firstname) ? firstname : Util.BLANK;
        this.lastname = Util.isValid(lastname) ? lastname : Util.BLANK;
        this.id = nextId++;
    }
    @Override
    public String toString() {
        return String.format("%s[id:%d,name:%s,%s]",
                this.getClass().getSimpleName(),id,firstname,lastname);
    }
    @Override public boolean equals(Object o) { return this == o; }
    @Override public int compareTo(Person p) { return this.id - p.id; }
    public int getId() { return id; }
    public String getFirstname() { return firstname; }
    public void setFirstname(String firstname) { if (Util.isValid(firstname)) this.firstname = firstname; }
    public String getLastname() { return lastname; }
    public void setLastname(String lastname) { if (Util.isValid(lastname)) this.lastname = lastname; }

}
