package AUDIService;

import Interfaces.IBrakePadsChange;

public class AUDIPads2000 implements IBrakePadsChange {
    @Override
    public int PadsCost() {
        System.out.println("Replacing pads on a AUDI before 2000 costs $ 130");
        return 130;
    }
}