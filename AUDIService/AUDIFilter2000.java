package AUDIService;

import Interfaces.IFilterChange;

public class AUDIFilter2000 implements IFilterChange{
    @Override
    public int FilterCost(){
        System.out.println("Replacing filter on a AUDI before 2000 costs $ 20");
        return 20;
    }
}