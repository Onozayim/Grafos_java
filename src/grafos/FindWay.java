
package grafos;

import java.util.ArrayList;
import java.util.List;

public class FindWay {
    
    public static List<Elements> road = new ArrayList<>();
    public static List<Elements> queue = new ArrayList<>();
    
   public static void findAWay(int point, int destiny) {
       road.add(new Elements(point, point));
       
       boolean keepSearching = true; 
       
       int iterator = 0;
       
       char[] letters = {
          'A', 'B', 'C', 'D', 'E', 'F', 'G'  
        };
       
       getChilds(point);
       
       while(queue.size() > 0) {
           
           Elements newElement = queue.get(queue.size() - 1);
           
           road.add(newElement);
           
           queue.remove(queue.size() - 1);
           
           iterator++;
           
           if(newElement.pointer == destiny) {       
                int startPoint = destiny;
                int checkPoints = 0;

                for (int i = road.size() - 1; i > 0; i--) {
                    Elements elemento = road.get(i);
                    
                    if(elemento.pointer == startPoint){
                        if(elemento.number != point) {
                            startPoint = elemento.number;
                            System.out.print(Nodos.nodos[elemento.pointer] + "-");
                        }else {
                            startPoint = elemento.number;
                            System.out.print(Nodos.nodos[elemento.pointer] + "<-" + Nodos.nodos[elemento.number]);
                        }
                        
                        checkPoints++;
                    }   
                }
                
                if(checkPoints >= Matrix.principalMatrix.length - 1){
                    System.out.println("");
                    System.exit(0);
                }

                System.out.println("");
       
               
               if(Matrix.principalMatrix[destiny][point] == 1)keepSearching = false;
           }else {
               getChilds(newElement.pointer);
           }
           
           
           
       }
       
       
   } 
   
   public static void getChilds(int pointer) {
       int numberofChilds = 0;
       
       for(int i = 0; i < Matrix.principalMatrix.length; i++) {
           if(Matrix.principalMatrix[pointer][i] == 1) {
               queue.add(new Elements(pointer, i));
               numberofChilds++;
           }
       }
   }
}
