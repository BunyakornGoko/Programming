package datatype;

public class generic <T> {
    T thingtoprint;

    public generic(T thingtoprint) {
        this.thingtoprint = thingtoprint;
    }

    public T getThingtoprint() {
        return thingtoprint;
    }

    public void setThingtoprint(T thingtoprint) {
        this.thingtoprint = thingtoprint;
    }
    public void print(){
        System.out.println(thingtoprint);
    }
    public void getType(){
        System.out.println(thingtoprint.getClass());
    }

    @Override
    public String toString() {
        return "generic{" +
                "thingtoprint=" + thingtoprint +
                '}';
    }
}
