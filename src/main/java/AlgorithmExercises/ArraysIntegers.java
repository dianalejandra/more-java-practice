package AlgorithmExercises;

/**
 * @author diana * Dado un vector de enteros imprimir los numeros del vector de
 * izquierda a derecha y luego de derecha a izquierda
 */
public class ArraysIntegers {

    // atributo estático o constante
    static int[] myArray = new int[]{5, 2, 66, 87, 9, 34, 40, 100, 12, 20};

    public static void main(String[] args) {
        //arrayOriginal();
        //arrayReverse();
        //arrayRandom();
        //numerosPrint(5);
        numerosPrintReverse(10);
    }

    public static void arrayOriginal() {
        // we define and initialize the array
        //version con for loop
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("El vector de izq a der: " + myArray[i]);
        }

        //System.out.println("El vector de izq a der: " + Arrays.tostring(myArray));
        /* otras opciones de hacer con loops       
        for(int element : myArray){
            System.out.println("El vector de izq a der: " + element);
        }
        for(i; i > myArray.length -1; i-- ){
            System.out.println("El vector de der a izq: " + myArray[i]);
        }
         */
    }

    public static void arrayReverse() {
        // vamos de lo particular a lo general. En este caso está tomando la variable declarada en este método
        int[] myArray = new int[]{5, 2, 66, 87, 9, 34, 40, 100, 12, 20};
        int i;

        for (i = myArray.length - 1; i >= 0; i--) {
            System.out.println("El vector de der a izq: " + myArray[i]);
        }
    }

    public static void arrayRandom() {
        // imprimir los nros del 1 al 7 en pantalla
        // int [] arrayNros = new int [] {1,2,3,4,5,6,7};
        // for (condicion de inicialización; condición de salida; acción por cada ciclo)
        for (int i = 1; i <= 7; i++) {    //es igual a decir i=i+1
            System.out.println("i");
        }
    }

    public static void numerosPrint(int numeroX) {
        // imprimir en pantalla números hasta un numeroX
        for (int i = 1; i <= numeroX; i++) {
            System.out.println("numeros: " + i);
        }
    }

    public static void numerosPrintReverse(int numeroX) {
        // imprimir en pantalla números hasta un numeroX
        for (int i = numeroX; i >= 0; i--) {
            System.out.println("numeros: " + i);
        }
    }

}
