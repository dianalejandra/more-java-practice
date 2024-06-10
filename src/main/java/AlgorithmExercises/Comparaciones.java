
package AlgorithmExercises;

/**
 *
 * @author diana
 * Compara variables y ordena variables
 * 
 */
public class Comparaciones {
    public static void main(String[] args) {
        int a = 50;
        int b = 10;
        int c = 30;
        comparar(a,b);
        ordenar(a,b,c);
    }
    
    public static void comparar(int a, int b){
        if (a > b){
            System.out.println("valor a es mayor que b.");
        } else if (b > a){
            System.out.println("valor b es mayor que a.");        
        } else {
            System.out.println("ambos valores son iguales");
        }
    }
    //ordena variables  de mayor a menor
    public static void ordenar(int a, int b, int c){
        if(a> b && a > c){
            if(b>c){
                System.out.println("El orden es: a-b-c");
            } else {
                System.out.println("El orden es: a-c-b");
            }
        }
        if (b>c && b>a){
            if(c>a){
                System.out.println("El orden es: b-c-a");
            } else{
                System.out.println("El orden es: b-a-c");
            }
        }
        if(c>a && c>b){
            String salida = a>b ? "El orden es: c-a-b" : "El orden es: c-b-a";
            System.out.println(salida);
        }        
    }    
}
