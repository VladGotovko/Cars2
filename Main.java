import Interfaces.IBrakePadsChange;
import Interfaces.ICarServiceFactory;
import Interfaces.IOilChange;

public class Main {

    public static void main(String[] args) throws Exception {
        CarServiceFactory factory = new CarServiceFactory();
        ICarServiceFactory bmwService = factory.createService("BMW", 2005);
        IBrakePadsChange bmwBrakePads;
        bmwBrakePads = bmwService.createPads();
        bmwBrakePads.PadsCost();
        ICarServiceFactory audiService = factory.createService("AUDI", 2015);
        IOilChange audiOil;
        audiOil = audiService.createOil();
        audiOil.OilCost();
        System.out.println();
        FullService fullService = new FullService("BMW", 1998);
        fullService.getResult();

    }
}