package AUDIService;

import Interfaces.IOilChange;

public class AUDIOil2010 implements IOilChange{
    @Override
    public int OilCost(){
        System.out.println("Replacing oil on a AUDI before 2010 costs $ 130");
        return 130;
    }
}