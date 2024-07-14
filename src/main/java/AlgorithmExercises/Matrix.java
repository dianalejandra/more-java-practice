package AlgorithmExercises;

/**
 * Given a 5 x 5 matrix, print the values of the diagonals, the middle column
 * and the middle row. All going left and right.
 */
public class Matrix {

    public static void main(String[] args) {
        int[][] my_matrix = new int[5][5];
        // we put a for to see each columnn element
        for (int i = 0; i < my_matrix.length; i++) {
            // we put another for to check every row element
            for (int j = 0; j < my_matrix[i].length; j++) {
                my_matrix[i][j] = i * 10 + j;
            }
        }
        System.out.println("Matrix values: ");
        // read through each element on the whole matrix
        for (int i = 0; i < my_matrix.length; i++) {
            // we put another for to check every row element
            for (int j = 0; j < my_matrix[i].length; j++) {
                System.out.print(my_matrix[i][j] + "\t");
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("Middle column values: ");
        // reading elements in middle column
        for (int i = 0; i < my_matrix.length; i++) {
            System.out.print(my_matrix[i][2] + "\t");
            System.out.println("");
        }

        System.out.println("");
        System.out.println("Middle row values: ");
        // reading elements in middle row
        for (int j = 0; j < my_matrix[2].length; j++) {
            System.out.print(my_matrix[2][j] + "\t");
        }
        
        System.out.println("");
        System.out.println("Main diagonal values: ");
        for (int i = 0; i < my_matrix.length; i++) {
            System.out.print(my_matrix[i][i] + "\t");
        }
        
        System.out.println("");
        System.out.println("Inverted diagonal values: ");
        for (int i = 0; i < my_matrix.length; i++) {
            System.out.print(my_matrix[i][my_matrix.length -1 -i] + "\t");
        }
    }
}
