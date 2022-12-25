package BMWService;

import Interfaces.IFilterChange;
public class BMWFilter2000 implements IFilterChange{
    @Override
    public int FilterCost(){
        System.out.println("Replacing filter on a BMW before 2000 costs $ 30");
        return 30;
    }
}