package AlgorithmExercises;

/**
 * Dado un número n, indicar si es primo o no, y en caso de que NO sea primo,
 * indicar cuál es el divisor.
 */
public class PrimeNumber {

    public static void main(String[] args) {
        isPrime();
    }

    public static void isPrime() {
        int num = 3;
        boolean notPrimeCheck = false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                notPrimeCheck = true;
                break;
            }
        }

        if (notPrimeCheck = false) {
            System.out.println(num + " es un numero primo.");
        } else {
            System.out.println(num + " no es un numero primo.");
        }
    }

}
