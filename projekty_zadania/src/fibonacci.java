package com.company;

public class fibonacci {
    public static void main(String[] args){
       int f,g,h;
       f = g = 1;
       int numberOfCalculations = 10;
       System.out.println(f + "\t" + g + "\t");
       for (int i = 0; i < numberOfCalculations;i++){
           h = f +g;
           f = g;
           g = h;
           System.out.println(h + "\t");
        }
    }
}
