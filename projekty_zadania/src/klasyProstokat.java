package com.company;

public class klasyProstokat
{
    private int bokA;
    private int bokB;

    public klasyProstokat()
    {
    }

    public klasyProstokat(int bokA, int bokB)
    {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    public int obliczPole()
    {
        return bokA * bokB;
    }

    public double obliczPrzekatna()
    {
        return Math.sqrt(bokA * bokA) + bokB * bokB;
    }

    public int getBokA()
    {
        return bokA;
    }

    public void setBokA(int bokA)
    {
        this.bokA = bokA;
    }

    public int getBokB()
    {
        return bokB;
    }

    public void setBokB(int bokB)
    {
        this.bokB = bokB;
    }
    public static void main(String[] args)
    {
        klasyProstokat prostokat = new klasyProstokat(2, 4);

        int pole = prostokat.obliczPole();

        double przekatna = prostokat.obliczPrzekatna();

        System.out.println("Pole = " + pole + "\t  Przek. = " + przekatna);

        prostokat.setBokA(3);
        System.out.println(prostokat.getBokA());
    }
}

