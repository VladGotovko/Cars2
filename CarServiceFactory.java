import AUDIService.CreateAUDIService;
import BMWService.CreateBMWService;
import Interfaces.ICarServiceFactory;

public class CarServiceFactory {
    public static ICarServiceFactory createService(String carBrand, int year){
        switch(carBrand){
            case "BMW":{
                return new CreateBMWService(year);
            }
            case "AUDI":{
                return new CreateAUDIService(year);
            }
            default:
                return null;
        }
    }
}