package com.umirrosi.demospringboot.singleton;

public class Manusia {

    private static Manusia manusia;

    private static Manusia getInstance(){
        if (manusia == null){
            manusia = new Manusia();
        }
        return manusia;
    }

    private Manusia(){

    }
}
