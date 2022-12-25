package BMWService;

import Interfaces.IFilterChange;

public class BMWFilter2020 implements IFilterChange{
    @Override
    public int FilterCost(){
        System.out.println("Replacing filter on a BMW before 2020 costs $ 110");
        return 110;
    }
}