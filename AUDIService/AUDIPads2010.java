package AUDIService;

import Interfaces.IBrakePadsChange;

public class AUDIPads2010 implements IBrakePadsChange {
    @Override
    public int PadsCost() {
        System.out.println("Replacing pads on a AUDI before 2010 costs $ 210");
        return 210;
    }
}