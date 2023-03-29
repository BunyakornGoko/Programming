package movement;

import animals.Animal;
import animals.LandAnimal;
import java.util.List;
public class AnimalShowCaseLowerbound {
    public void show(List<? super LandAnimal> list){
        for(Object obj : list){
            System.out.println(obj);
        }
    }

}
