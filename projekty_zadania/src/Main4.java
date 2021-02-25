package com.company;

public class Main4 {
    public static void main(String[] args)
    {
        char PierwszaLitera = 'A';

        for (int i = 0; i < 26; i++)
        {
            if ( i % 2 == 0)
                System.out.print(PierwszaLitera + "\t");
            PierwszaLitera++;
        }
    }
}


