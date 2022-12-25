package AUDIService;

import Interfaces.IOilChange;

public class AUDIOil2000 implements IOilChange{
    @Override
    public int OilCost(){
        System.out.println("Replacing oil on a AUDI before 2000 costs $ 70");
        return 70;
    }
}