package person;

public class Person {
    String name;
    String lastname;
    int year;
    int age;

    public Person(String name, String lastname, int year, int age) {
        this.name = name;
        this.lastname = lastname;
        this.year = year;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", year=" + year +
                ", age=" + age +
                '}';
    }
}
