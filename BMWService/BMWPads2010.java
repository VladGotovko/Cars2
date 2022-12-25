package BMWService;
import Interfaces.IBrakePadsChange;
public class BMWPads2010 implements IBrakePadsChange {
    @Override
    public int PadsCost() {
        System.out.println("Replacing pads on a BMW before 2010 costs $ 400");
        return 400;
    }
}