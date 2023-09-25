package javapractice;

import java.util.Arrays;

/**
 * Ordenar un array desordenado. No usar la funcion sort de Java. Sort an
 * unordered array. Do not use Java's sort function
 */
public class UnorderedArray {

    public static void main(String[] args) {

        int[] numArray = {5, 2, 66, 87, 9, 34, 40, 100, 12, 20, 1, 3, 78, 66, 2, 56, 22, 202, 10, 32};
        int index = -1;
        System.out.println("The unordered array is: " + Arrays.toString(numArray));

        for (int i = 0; i < numArray.length; i++) {
            index = i;
            for (int j = i; j <= numArray.length - 1; j++) {
                if (numArray[j] < numArray[index]) {
                    index = j;
                }
            }
            int temp = numArray[i];
            numArray[i] = numArray[index];
            numArray[index] = temp;
        }
        
        System.out.print("The ordered array is: [");
        for(int i = 0; i < numArray.length; i++){
            System.out.print(numArray[i] + ", ");
        }
        System.out.print("]");
    }
}
