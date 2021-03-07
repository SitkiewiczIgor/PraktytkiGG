package com.company1;

public class Rocznikowanie extends Wino{
    void rocznik(){
        System.out.println("rocznik to 1939");
    }
    @Override
    void bulgocze() {
        System.out.println("Bulgocze");
    }
    @Override
    void nalewanie() {
        System.out.println("Jest nalewane");
    }
}
