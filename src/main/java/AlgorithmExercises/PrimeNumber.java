package AlgorithmExercises;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/** Given a random number, indicate if it is prime or not. If it is not, show the possible dividends.*/
public class PrimeNumber {

    public static void main(String[] args) {
        isPrime();
    }

    public static void isPrime() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime: ");
        int num = keyboard.nextInt();
        int dividend = 0; // dividend can be stored in an array
        int [] dividendArray = new int [] {};
        List <Integer> dividendList = new ArrayList<>();
        boolean primeCheck = false;
        if(num <= 1){ // excluding 0 and 1
            System.out.println(num + " is NOT a prime number");
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0 ) {
                    primeCheck = true;
                    dividend = i;
                    dividendArray = 
                    for(int s : dividendArray){
                    dividend = Integer.parseInt(s);
                    dividendList.add(dividend);                    
                    }
                }
            }
            if (!primeCheck) {
                System.out.println(num + " IS a prime number");
            } else {
                System.out.println(num + " is NOT a prime number");
                System.out.println("Dividends: " + dividendList);
            }
        }
    }

}
