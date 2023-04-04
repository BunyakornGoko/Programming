package exam.base;

//5. (10 points) Given the following Group class that works as a group of Objects.
//Convert this code to use Generic; i.e., Group<T>. In case that the given code
//works incorrectly, correct it as well.

public class Group<T> {

    private final T[] ts;
    private int size;

    public Group(int capacity) {
        ts = (T[]) new Object[size < 2 ? 2 : size];
    }

    public int getSize() {
        return size;
    }

    public boolean append(T t) {
        if (t == null || size == ts.length) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (ts[i] == t) {
                return false;
            }
        }
        ts[size++] = t;
        return true;
    }

    public int find(T t) {
        for (int i = 0; i < size; i++) {
            if (ts[i] == t) {
                return i;
            }
        }
        return -1;
    }

    public boolean remove(T t) {
        int x = find(t);
        if (x == -1) {
            return false;
        }
        size--;
        if (x < size) {
            ts[x] = ts[size];
        }
        ts[size] = null;
        return true;
    }

    public Object get(int i) {
        if (i > -1 && i < size) {
            return ts[i];
        }
        return null;
    }
}
