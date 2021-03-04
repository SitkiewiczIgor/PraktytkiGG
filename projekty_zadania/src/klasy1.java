package com.company;
import java.util.Scanner;

public class klasy1 {
    public static void main(String[] args)
    {
        boolean programIsRunning = true;

        SimpleCalculator calculator = new SimpleCalculator();
        while (programIsRunning)
        {
            Scanner sc = new Scanner(System.in);

            System.out.println("Co chcesz robić:\n[1] Dodać\n[2] Odjąć\n[3] Mnożyć\n[4] Dzielić\n[5] Wyjść");

            String userChoice = sc.next();
            System.out.println("Podaj a");
            double a = sc.nextDouble();
            System.out.println("Podaj b");
            double b = sc.nextDouble();

            switch (userChoice)
            {
                case "1": {
                    System.out.println(calculator.add(a, b) + "\n\n");
                    break;
                }
                case "2": {
                    System.out.println(calculator.difference(a, b));
                    break;
                }
                case "3": {
                    System.out.println(calculator.multiply(a, b));
                    break;
                }
                case "4": {
                    System.out.println(calculator.divide(a, b));
                    break;
                }
                case "5": {
                    programIsRunning = false;
                    break;
                }
                default: {
                    System.out.println("Błędny wybór");
                    break;
                }
            }
        }
    }
    public static class SimpleCalculator
    {
        public double add(double numOne, double numTwo)
        {
            return numOne + numTwo;
        }

        public double difference(double numOne, double numTwo)
        {
            return numOne - numTwo;
        }

        public double multiply(double numOne, double numTwo)
        {
            return numOne * numTwo;
        }

        public double divide(double numOne, double numTwo)
        {
            if (numTwo == 0 )
            {
                System.out.println("Nie można dzielić przez zero.");
                return 0;
            }
            return numOne / numTwo;
        }
    }
}
