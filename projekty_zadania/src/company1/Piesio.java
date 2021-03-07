package com.company1;

public class Piesio extends Zwierze implements ZwierzeDomowe {
    @Override
    public int wiek() {
        return 5;
    }

    @Override
    public void wydajDzwiek() {
        System.out.println("Hau Hau");
    }

    @Override
    public void bawsie() {
        System.out.println("Bawi sie");
    }

    @Override
    public void badzmily() {
        System.out.println("jest mily");
    }
}

