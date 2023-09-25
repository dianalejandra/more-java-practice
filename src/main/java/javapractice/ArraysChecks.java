package javapractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * Dados dos arraylist (arrayA y arrayB) de números imprimir en pantalla los números presentes en A ausentes en B y viceversa. Luego los números en común.
 * Given two arraylist (arrayA and arrayB) of numbers, print on the screen the numbers present in A that are absent in B and vice versa. Then the numbers in common.
 */

public class ArraysChecks {

    public static void main(String[] args) {
        
        int [] arrayA = {5, 2, 66, 87, 9, 34, 40, 100, 12, 20};
        int [] arrayB = {1, 3, 78, 66, 2, 56, 22, 202, 10, 32};
        
        ArrayList<Integer> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();
        
        for (int num : arrayA){
            listA.add(num);
        }
        
        for (int num : arrayB){
            listB.add(num);
        }
        
        ArrayList<Integer> notInB = new ArrayList<>(listA);
        notInB.removeAll(listB);
        
        ArrayList<Integer> notInA = new ArrayList<>(listB);
        notInA.removeAll(listA);
        
        HashSet<Integer> groupA = new HashSet <>(listA);
        HashSet<Integer> groupB = new HashSet <>(listB);
        
        groupA.retainAll(groupB);
        
        System.out.println("The array A is: " + Arrays.toString(arrayA));
        System.out.println("The array B is: " + Arrays.toString(arrayB));
        System.out.println("Numbers present in A but absent in B are: " + notInB);
        System.out.println("Numbers present in B but absent in A are: " + notInA);
        System.out.println("Numbers in common between arrays " + groupA);
    }
}
