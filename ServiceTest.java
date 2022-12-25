import Interfaces.IBrakePadsChange;
import Interfaces.ICarServiceFactory;
import Interfaces.IFilterChange;
import Interfaces.IOilChange;
import org.junit.Assert;
import org.junit.Test;

public class ServiceTest {

    @Test
    public void FullServiceTest() throws Exception {
        FullService fullService = new FullService("AUDI", 1996);
        int actual = fullService.getResult();
        int result = 220;
        Assert.assertEquals(result, actual);
    }

    @Test
    public void PadsTest() throws Exception {
        CarServiceFactory factory = new CarServiceFactory();
        ICarServiceFactory bmwService = factory.createService("BMW", 2002);
        IBrakePadsChange bmwBrakePads;
        bmwBrakePads = bmwService.createPads();
        int actual = bmwBrakePads.PadsCost();
        int result = 400;
        Assert.assertEquals(result, actual);
    }

    @Test
    public void OilTest() throws Exception {
        CarServiceFactory factory = new CarServiceFactory();
        ICarServiceFactory audiService = factory.createService("AUDI", 2012);
        IOilChange audiOil;
        audiOil = audiService.createOil();
        int actual = audiOil.OilCost();
        int result = 170;
        Assert.assertEquals(result, actual);
    }

    @Test
    public void FIlterTest() throws Exception {
        CarServiceFactory factory = new CarServiceFactory();
        ICarServiceFactory audiService = factory.createService("AUDI", 2001);
        IFilterChange audiFilter;
        audiFilter = audiService.createFilter();
        int actual = audiFilter.FilterCost();
        int result = 40;
        Assert.assertEquals(result, actual);
    }
}