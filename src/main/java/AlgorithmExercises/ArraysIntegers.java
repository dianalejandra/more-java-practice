package AlgorithmExercises;

/**
 *
 * @author diana
 * 
 * Dado un vector de enteros imprimir los numeros del vector de izquierda a derecha y luego de derecha a izquierda
 */
public class ArraysIntegers {
    public static void main(String[] args) {
        arrayOriginal();
        arrayReverse();
    }
    
    public static void arrayOriginal(){
    // we define and initialize the array
        int[] myArray = new int [] {5, 2, 66, 87, 9, 34, 40, 100, 12, 20};
        int i;
        
        for (i=0; i < myArray.length; i ++){
            System.out.println("El vector de izq a der: "+ myArray[i]);
        } 
        
        /*
        
        for(int element : myArray){
            System.out.println("El vector de izq a der: " + element);
        }
        for(i; i > myArray.length -1; i-- ){
            System.out.println("El vector de der a izq: " + myArray[i]);
        }
        */
    }
    
    public static void arrayReverse(){
        int[] myArray = new int [] {5, 2, 66, 87, 9, 34, 40, 100, 12, 20};
        int i;
        
        for(i = myArray.length-1; i>=0; i--){
            System.out.println("El vector de der a izq: " + myArray[i]);
        }
    
    }
}
