package AUDIService;

import Interfaces.IFilterChange;

public class AUDIFilter2020 implements IFilterChange{
    @Override
    public int FilterCost(){
        System.out.println("Replacing filter on a AUDI before 2020 costs $ 70");
        return 70;
    }
}