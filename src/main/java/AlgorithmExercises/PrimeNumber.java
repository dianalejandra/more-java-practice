
package AlgorithmExercises;

/**
 *
 * @author diana
 * 
 * Dado un número n, indicar si es primo o no, y en caso de que NO sea primo, indicar cuál es el divisor
 * 
 * 
 */
public class PrimeNumber {
    public static void main(String[] args) {
        isPrime();
    }
    
    public static void isPrime(){
        int num = 4;
        
        if (num >1 && num / num == 1 || num / 1 == num){
            System.out.println("El número " + num + " es primo");
        }
        
    }
    
}
