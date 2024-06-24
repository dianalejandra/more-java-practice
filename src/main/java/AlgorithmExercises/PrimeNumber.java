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
        int num = 0;
        boolean primeCheck = false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0 ) { //necesito lograr que ni 0 ni 1 los reconozca como primos
                primeCheck = true;
                break;
            }
        }

        if (!primeCheck) {
            System.out.println(num + " es un numero primo.");
        } else {
            System.out.println(num + " NO es un numero primo.");
        }
    }

}
