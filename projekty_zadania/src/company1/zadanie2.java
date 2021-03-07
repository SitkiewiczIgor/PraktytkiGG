package com.company1;

public class zadanie2 {
    public static void main(String[] args){
        samochod samochod = new samochod();
        System.out.println(samochod.awaria());
        samochod.jedzDoPrzodu();
        samochod.skrecwLewo();
        samochod.skrecwPrawo();
        samochod.stop();
    }
}
