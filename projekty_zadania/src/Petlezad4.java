package com.company;

public class Petlezad4 {
    public static void main(String[] args){
        for (int i = 1; i < 10;i++){
            for (int j = 1; j <10;j++){
                if( (j*i) % 6 == 0){
                    System.out.println(j*i + "\t");
                }
               else {
                    System.out.println("x\t");
                }
            }
        }
    }
}
