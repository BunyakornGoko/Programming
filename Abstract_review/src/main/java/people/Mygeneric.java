package people;

public class Mygeneric<T> {
    private T t;

    public Mygeneric(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
