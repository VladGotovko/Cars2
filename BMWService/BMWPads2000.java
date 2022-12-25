package BMWService;
import Interfaces.IBrakePadsChange;
public class BMWPads2000 implements IBrakePadsChange {
    @Override
    public int PadsCost() {
        System.out.println("Replacing pads on a BMW before 2000 costs $ 200");
        return 200;
    }
}