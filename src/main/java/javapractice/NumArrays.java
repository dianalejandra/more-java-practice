package javapractice;

import java.util.Arrays;

/**
 * Dado un arraylist de numeros. Encontrar maximo, mínimo, promedio, suma total y desviación estándar.
 * Given a number arraylist, find max value, min value, average, sum of all values and a standard deviation.
 */
public class NumArrays {

    public static void main(String[] args) {
        int[] numArray = {5, 2, 66, 87, 9, 34, 40, 100, 12, 20};
        int min = numArray[0];
        int max = numArray[0];
        int sum = 0;
        double average = sum / (numArray.length);
        double sumSqrtDif = 0.0;
        double standardDeviation = Math.sqrt(sumSqrtDif / numArray.length);

        for (int num : numArray) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            sum += num;
            double dif = num - average;
            sumSqrtDif += dif * dif;
        }
        average = sum / (numArray.length);
        standardDeviation = Math.sqrt(sumSqrtDif / numArray.length);
        
        System.out.println("The array is: " + Arrays.toString(numArray));
        System.out.println("The minimum value of the array is: " + min);
        System.out.println("The maximum value of the array is: " + max);
        System.out.println("The sum of all values is " + sum);
        System.out.println("The average of all values is: " + average);
        System.out.println("The standard deviation of all values is: " + standardDeviation);
    }
}
