package com.company;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean programIsRunning = true;

        while(programIsRunning)
        {
            System.out.print("Podaj numer drzwi: ");
            String userInput = sc.next();

            switch (userInput)
            {
                case "1": {
                    System.out.println("Złe drzwi >:)");
                    break;
                }
                case "2": {
                    System.out.println("Złe drzwi >:)");
                    break;
                }
                case "3": {
                    programIsRunning = false;
                    break;
                }
                case "4": {
                    System.out.println("Złe drzwi >:)");
                    break;
                }
                case "5": {
                    System.out.println("Złe drzwi >:)");
                    break;
                }
                default: {
                    System.out.println("Podałeś złe dane!");
                }
            }
        }

        System.out.println("Gratulacje skończyłeś lochy!");
    }

}
