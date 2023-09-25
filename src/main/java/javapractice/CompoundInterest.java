package javapractice;

import java.util.Scanner;

/*
Hacer un algoritmo que calcule interés compuesto dado un importe inicial y una tasa mensual definida
Make an algorithm that calculates compound interest given an initial amount and a defined monthly rate
*/

public class CompoundInterest {
    
    public static double calculateCompoundInterest(int months, double initialAmount, double monthlyRate){
        double compoundInterest = initialAmount * Math.pow((1 + (monthlyRate / 100)), months);
        return compoundInterest;
    }
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the initial amount that you want to calculate:");
        double initialAmount = keyboard.nextDouble();
        System.out.println("Now, enter the monthly rate of the interest:");
        double monthlyRate = keyboard.nextDouble();
        
        Scanner keyboard2 = new Scanner(System.in);
        System.out.println("Finally, enter how many months you want to calculate:");
        int months = keyboard2.nextInt();
        
        double acumulatedAmount = calculateCompoundInterest(months, initialAmount, monthlyRate);
        double roundedAmount = Math.round(acumulatedAmount * 100.0) / 100.0;
        System.out.println("The acumulated amount after " + months + " months is: $" + roundedAmount);
    
    }
}
