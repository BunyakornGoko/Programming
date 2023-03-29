package people;

public class Students extends Person {
    private int stdid;

    public Students(String name, int age, String citizen, int stdid) {
        super(name, age, citizen);
        this.stdid = stdid;
    }

    @Override
    public String toString() {
        return "Students{" +
                "stdid=" + stdid +
                '}';
    }

    @Override
    public void Saymyname(){
        System.out.println(super.getName() + " "+ stdid);
    }
}
