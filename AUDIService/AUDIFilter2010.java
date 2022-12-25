package AUDIService;

import Interfaces.IFilterChange;

public class AUDIFilter2010 implements IFilterChange{
    @Override
    public int FilterCost(){
        System.out.println("Replacing filter on a AUDI before 2010 costs $ 40");
        return 40;
    }
}