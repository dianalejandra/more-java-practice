package AlgorithmExercises;

/** Given a random number, indicate if it is prime or not. If it is not, show the possible divisors.*/
public class PrimeNumber {

    public static void main(String[] args) {
        isPrime();
    }

    public static void isPrime() {
        int num = 2;       
        boolean primeCheck = false;
        if(num <= 1){ // excluding 0 and 1
            System.out.println(num + " NOT a prime number");
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0 ) {
                    primeCheck = true;
                    break;
                }
            }
            if (!primeCheck) {
                System.out.println(num + " IS a prime number");
            } else {
                System.out.println(num + " NOT a prime number");
            }
        }
    }

}
