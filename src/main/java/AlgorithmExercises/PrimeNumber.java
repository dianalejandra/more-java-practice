package AlgorithmExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Given a random number, indicate if it is prime or not. If it is not, show the
 * possible divisors.
 */
public class PrimeNumber {

    public static void main(String[] args) {
        isPrime();
    }

    public static void isPrime() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime: ");
        int num = keyboard.nextInt();
        List<Integer> divisorList = new ArrayList<>(); // we create a list to store possible divisors 
        if (num <= 1) { // excluding 0 and 1
            System.out.println(num + " is NOT a prime number");
        } else { // we do num/2 because a number is not divisible by more than half its value
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    divisorList.add(i);
                }
            }
            if (divisorList.isEmpty()) {
                System.out.println(num + " IS a prime number");
            } else {
                System.out.println(num + " is NOT a prime number");
                System.out.println("Divisors: " + divisorList);
            }
        }
    }
}