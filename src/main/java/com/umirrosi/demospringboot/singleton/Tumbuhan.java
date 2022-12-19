package com.umirrosi.demospringboot.singleton;

public class Tumbuhan {

    public static Tumbuhan tumbuhan;
    public static Tumbuhan getInstance(){
        if(tumbuhan == null){
            tumbuhan= new Tumbuhan();
        }
        return tumbuhan;
    }
    private Tumbuhan(){

    }
}
