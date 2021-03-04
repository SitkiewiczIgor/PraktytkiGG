package com.company;

public class Spawacz extends Praca{

    private boolean czyJestNiebezpieczna;

    public Spawacz(double pensja,String etat, boolean czyJestFajna, boolean czyJestNiebezpieczna){
        super(pensja, etat, czyJestFajna, czyJestNiebezpieczna);
        this.czyJestNiebezpieczna = czyJestNiebezpieczna;
    }

    public void wykonujePrace(){
        System.out.println("spawam");
    }

    public boolean isCzyJestNiebezpieczna(){
        return czyJestNiebezpieczna;
    }

    public void setCzyJestNiebezpieczna(boolean czyJestNiebezpieczna){
        this.czyJestNiebezpieczna = czyJestNiebezpieczna;
    }
}
