package grafos;

import java.util.Scanner;

public class Matrix {
    public static int[][] principalMatrix;
    
    public static void fillMatrix(int size) {
        Matrix.principalMatrix = new int[size][size];
        Scanner scan = new Scanner(System.in);
        
        char[] letters = {
          'A', 'B', 'C', 'D', 'E', 'F', 'G'  
        };
        
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) Matrix.principalMatrix[i][j] = 0;
        }
           
    }

}
