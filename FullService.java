import Interfaces.IBrakePadsChange;
import Interfaces.ICarServiceFactory;
import Interfaces.IFilterChange;
import Interfaces.IOilChange;

public class FullService {
    private IBrakePadsChange brakePads;
    private IFilterChange filter;
    private IOilChange oil;
    public FullService(String carBrand, int year) throws Exception {
        CarServiceFactory factory = new CarServiceFactory();
        ICarServiceFactory service = factory.createService(carBrand, year);
        brakePads = service.createPads();
        filter = service.createFilter();
        oil = service.createOil();
    }
    public int getResult(){
        int result;
        result = brakePads.PadsCost() + filter.FilterCost() + oil.OilCost();
        System.out.println("Total amount: " + result);
        return result;
    }
}