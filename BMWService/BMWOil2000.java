package BMWService;
import Interfaces.IOilChange;
public class BMWOil2000 implements IOilChange{
    @Override
    public int OilCost(){
        System.out.println("Replacing oil on a BMW before 2000 costs $ 100");
        return 100;
    }
}