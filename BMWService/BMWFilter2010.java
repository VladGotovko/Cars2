package BMWService;

import Interfaces.IFilterChange;
public class BMWFilter2010 implements IFilterChange{
    @Override
    public int FilterCost(){
        System.out.println("Replacing filter on a BMW before 2010 costs $ 50");
        return 50;
    }
}