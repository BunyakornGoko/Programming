package movement;

import animals.LandAnimal;
import java.util.List;

public class AnimalShowCaseUpperbound {
    public void show(List<? extends LandAnimal> list){
        for(Object obj : list){
            System.out.println(obj);
        }
    }
}
