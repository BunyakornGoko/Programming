package exam.unit;

import exam.base.OrgUnit;

public class Staff {
    private int id;
    private String firstname;
    private String lastname;
    private OrgUnit affialiation;

    public Staff(int id, String firstname, String lastname, OrgUnit affialiation) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.affialiation = affialiation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public OrgUnit getAffialiation() {
        return affialiation;
    }

    public void setAffialiation(OrgUnit affialiation) {
        this.affialiation = affialiation;
    }
}
