package com.umirrosi.demospringboot.singleton;

public class BendaMati {
    public static BendaMati bendaMati;

    public static BendaMati getInstance(){
        if (bendaMati==null){
            bendaMati = new BendaMati();
        }
        return bendaMati;
    }
    private BendaMati(){

    }
}
