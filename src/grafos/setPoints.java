package grafos;

import java.util.Scanner;

public class setPoints {
    
    public static void setBothPoints(int size) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese el nodo de partida ");
        
        String partida = scan.nextLine();
        
        int num1 = 0;
        
        for(int i = 0; i < size; i++) {
            if(partida.equals(Nodos.nodos[i])){
                num1 = i;
                break;
            }
        }
        
        System.out.print("Ingrese el nodo de salida ");
        
        String salida = scan.nextLine();
        
        int num2 = 0;
        
        for(int i = 0; i < size; i++) {
            if(salida.equals(Nodos.nodos[i])){
                num2 = i;
                break;
            }
        }
        
        FindWay.findAWay(num1, num2);
    }
}
