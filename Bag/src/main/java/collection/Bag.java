package collection;

import java.util.HashMap;
import java.util.Map;

public class Bag<E> {
    private Map<E , Integer> m = new HashMap<>();

    public int add(E e){
        if (e == null){
            return -1;
        }
        var i = m.get(e);
        if (i == null){
            m.put(e , 1);
            return 1;
        }
        m.put(e , ++i);
        return i;
    }
    public int remove(E e){
        if(e == null){
            return -1;
        }
        var i = m.remove(e);
        return i == null ? 0 : i;
    }
    public int get(E e){
        if(e == null){
            return -1;
        }
        var i = m.get(e);
        return i == null ? 0 : i;
    }

}