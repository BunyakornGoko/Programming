package exam.unit;

import exam.base.OrgUnit;

public class Department extends OrgUnit {
    public Department(int code, String name, School school) {
        super(code, name);
        this.school = school;
    }

    private School school;



    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
        this.logging += school.getCode() + ";";
    }

}
