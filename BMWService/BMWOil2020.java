package BMWService;
import Interfaces.IOilChange;
public class BMWOil2020 implements IOilChange{
    @Override
    public int OilCost(){
        System.out.println("Replacing oil on a BMW before 2020 costs $ 310");
        return 310;
    }
}