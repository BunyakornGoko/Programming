package people;

public class Person {
    private String name;
    private int age;
    private String citizen;

    public Person(String name, int age, String citizen) {
        this.name = name;
        this.age = age;
        this.citizen = citizen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCitizen() {
        return citizen;
    }

    public void setCitizen(String citizen) {
        this.citizen = citizen;
    }
    public void Saymyname(){
        System.out.println("My name is " + name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", citizen='" + citizen + '\'' +
                '}';
    }

}
