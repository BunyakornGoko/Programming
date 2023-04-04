package exam.main;
import exam.base.*;
import exam.unit.Department;
import exam.unit.School;

public class Test {
    public static void main(String[] args) {
        testSchool();
        testDepartment();
        testSchoolAsOrgUnit();
        testDepartmentAsLoggable();
        testStaff();
        testDepartmentGroup();
    }
    //  3.1. testSchool() tests that School objects work correctly as School.
    static void testSchool(){
        School s1 = new School(1,"RO");
        s1.setName("Watrajaoros");
        s1.earn(100.0);
        s1.spend(5000.0);
        System.out.format("Code [%d] Name[%s] Balance[%f]" ,s1.getCode() , s1.getName(),s1.getBalance());
        System.out.println("\n--------------------");
    }
    //  3.2. testDepartment() tests that Department objects work correctly as Department.
    static void testDepartment(){
        Department d1 = new Department(1,"IT",new School(1, "KMUTT"));
        d1.setSchool(new School(1,"WAT"));
        System.out.format("\nCode[%d] Name[%s] School[%s] Get Log[%s]%n" , d1.getCode(),d1.getName(),d1.getSchool(),d1.getLog());
    }
    //  3.3. testSchoolAsOrgUnit() tests that School objects work correctly as OrgUnit.
    static void testSchoolAsOrgUnit(){
        
    }
    //  3.4. testDepartmentAsLoggable() tests that Department objects work correctly as Loggable.
    static void testDepartmentAsLoggable(){

    }
    //  4.2. Write a test method named testStaff() in the MainOrgTest to test that
//  Staff objects work correctly on its constructor and both getter and setter
//  for affiliation attribute.
    static void testStaff(){

    }
//    6. (10 points) Write a test method named testDepartmentGroup() in the MainOrgTest
//    to test that Group<Department> objects work correctly on append(), find(), remove(),
//    and get() and also use a for loop to access all Department objects in the group.
    static void testDepartmentGroup(){

    }

}
