package ListaAdyacencia;

import java.util.*;

class GrafoListAdj<T> {
    private Map<T, List<T> > map = new HashMap<>();
    public void addVertex(T s) {
        map.put(s, new LinkedList<T>());
    }

    public void addEdge(T origen,T destino, boolean direc){
        if (!map.containsKey(origen))
            addVertex(origen);
        if (!map.containsKey(destino))
            addVertex(destino);
  
        map.get(origen).add(destino);
        if (direc == true) {
            map.get(destino).add(origen);
        }
    }
  
    public void getVertexCount(){
        System.out.println("El grafo tiene " + map.keySet().size() + " vertices");
    }
  
    public void getEdgesCount(boolean direc) {
        int contador = 0;
        for (T v : map.keySet()) {
            contador += map.get(v).size();
        }
        if (direc == true) {
            contador = contador / 2;
        }
        System.out.println("El grafo tiene " + contador+ " aristas.");
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
  
