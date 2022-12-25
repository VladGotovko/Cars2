package AUDIService;

import Interfaces.IOilChange;

public class AUDIOil2020 implements IOilChange{
    @Override
    public int OilCost(){
        System.out.println("Replacing oil on a AUDI before 2020 costs $ 170");
        return 170;
    }
}