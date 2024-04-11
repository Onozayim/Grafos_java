package grafos;

public class Nodos {
    public static String[] nodos;
    
    public Nodos(int size) {
        nodos = new String[size];
    }
    
    public void fillNodos(String nodosInput) {
        
        int size = nodosInput.length();
        
        for(int i = 0; i < size; i++){
            nodos[i] = nodosInput.substring(i, i + 1);
        } 
    }
}
