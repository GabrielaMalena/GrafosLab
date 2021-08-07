package ListaAdyacencia;

import java.util.*;

class GrafoListAdj<T> {
    private Map<T, List<T> > map = new HashMap<>();
    public void addVertex(T s) {
        map.put(s, new LinkedList<T>());
    }

    public void addEdge(T source,T destination, boolean bidirectional){
        if (!map.containsKey(source))
            addVertex(source);
        if (!map.containsKey(destination))
            addVertex(destination);
  
        map.get(source).add(destination);
        if (bidirectional == true) {
            map.get(destination).add(source);
        }
    }
  
    public void getVertexCount(){
        System.out.println("The graph has " + map.keySet().size() + " vertex");
    }
  
    public void getEdgesCount(boolean bidirection) {
        int contador = 0;
        for (T v : map.keySet()) {
            contador += map.get(v).size();
        }
        if (bidirection == true) {
            contador = contador / 2;
        }
        System.out.println("The graph has " + contador+ " edges.");
    }
  
 
    public void hasVertex(T s){ // para comprobar mis vertices
        if (map.containsKey(s)) {
            System.out.println("El grafo contiene " + s + " vertices...");
        }
        else {
            System.out.println("el grafo no contiene " + s + " este vertice.");
        }
    }
  
    public void hasEdge(T s, T d)  { //si edge esta presente o no
        if (map.get(s).contains(d)) {
            System.out.println("El grafo tiene una arista entre "  + s + " y tambien " + d + ".");
        }
        else {
            System.out.println("El grafo no tiene una arista entre "  + s + " y tambien " + d + ".");
        }
    }
  
 
    public String toString()  { // me va imprimir mi lista de adyacencia
        StringBuilder builder = new StringBuilder();
        for (T v : map.keySet()) {
            builder.append(v.toString() + ": ");
            for (T w : map.get(v)) {
                builder.append(w.toString() + " ");
            }
            builder.append("\n");
        }
        return (builder.toString());
    }
}
  
