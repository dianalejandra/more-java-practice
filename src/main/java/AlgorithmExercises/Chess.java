package AlgorithmExercises;

/**
 * Simulate knight's movement and show all possible movements depending on where the piece is located
 */
public class Chess {
    //initial position of the knight:
    int knightI = 2;
    int knightJ = 1;
    
    public static void main(String[] args) {
        int [][] board = new int [8][8];
        for(int i=0; i < board.length; i++){
            for(int j=0; j < board[i].length; j++){
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    public void getKnightValidMovements(){
        
        int move1i= knightI +2;
        int move1j= knightJ -1;
                
        int move2i= knightI +2;
        int move2j= knightJ +1;
        
        int move3i= knightI +1;
        int move3j= knightJ +2;
        
        int move4i= knightI -1;
        int move4j= knightJ +2;
        
        int move5i= knightI -2;
        int move5j= knightJ +1;
        
        int move6i= knightI -2 ;
        int move6j= knightJ -1;
        
        // these two are not posible because of the current position of the knight
        // but are valid movements
        
        int move7i= knightI -1;
        int move7j= knightJ -2;
        
        int move8i= knightI +1;
        int move8j= knightJ -2;
        
    }
}
