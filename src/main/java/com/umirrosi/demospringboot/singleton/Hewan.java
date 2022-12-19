package com.umirrosi.demospringboot.singleton;

public class Hewan {
    private static Hewan hewan;

    public static Hewan getInstance(){
        if(hewan == null){
            hewan = new Hewan();
        }
        return hewan;
    }

    private Hewan(){

    }
}
