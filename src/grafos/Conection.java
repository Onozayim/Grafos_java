package grafos;

import java.util.Scanner;

public class Conection {
    public Conection() {}
    
    public static void setConnections(int size) {
        
        Scanner scan = new Scanner(System.in);
        
        for(int i = 0; i < size; i++){
            boolean keepReading = true;
            
            System.out.println("Ingrese los nodos conectores de '" + Nodos.nodos[i] + "' ingrese 'sig' para llenar el siguiente nodo");
            
            while(keepReading){
                
                String newNodo = scan.nextLine();
                System.out.println("");
                
                for(int j = 0; j < size; j++) {
                    
                    if(newNodo.equals("sig")){
                        keepReading = false;
                        continue;
                    }
                    
                    if(newNodo.equals(Nodos.nodos[j])) {
                        if(i != j) Matrix.principalMatrix[i][j] = 1;
                        else System.out.println("Un nodo no se puede conectar consigo mismo");
                    }
                }
            }
        }
    }
}
