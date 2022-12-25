package BMWService;
import Interfaces.IOilChange;
public class BMWOil2010 implements IOilChange{
    @Override
    public int OilCost(){
        System.out.println("Replacing oil on a BMW before 2010 costs $ 130");
        return 130;
    }
}