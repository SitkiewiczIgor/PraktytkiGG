package com.company;

public class Praca {
    private double pensja;
    private String etat;
    private boolean czyJestFajna;
    private boolean czyJestNiebezpieczna;

    public Praca(double pensja, String etat, boolean czyJestFajna, boolean czyJestNiebezpieczna) {
        this.pensja = pensja;
        this.etat = etat;
        this.czyJestFajna = czyJestFajna;
        this.czyJestNiebezpieczna = czyJestNiebezpieczna;
    }

    public void wykonujePrace() {
        System.out.println("Wykonuje prace");
    }

    public double getPensja() {
        return pensja;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }

    public String getEtat() {
        return etat;
    }

    public boolean isCzyJestFajna() {
        return czyJestFajna;
    }

    public boolean isCzyJestNiebezpieczna() {
        return czyJestFajna;
    }
}


