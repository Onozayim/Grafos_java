package grafos;

import java.util.Scanner;

public class GrafosProfundidad {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese los nodos: ");
        String nodosInput = scan.nextLine();
        
        int size = nodosInput.length();
        
        Matrix.fillMatrix(size);
        
        System.out.println("");
        
        Nodos nodos = new Nodos(size);
        
        nodos.fillNodos(nodosInput);
        
        Conection.setConnections(size);
        
        System.out.println("");
        
        setPoints.setBothPoints(size);       
    }
    
}
