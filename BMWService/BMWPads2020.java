package BMWService;
import Interfaces.IBrakePadsChange;
public class BMWPads2020 implements IBrakePadsChange {
    @Override
    public int PadsCost() {
        System.out.println("Replacing pads on a BMW before 2020 costs $ 700");
        return 700;
    }
}