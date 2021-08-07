
public class Edge<E> {
	protected Vertex<E> refDest;
	protected int weight;
	protected int label; //0=unexplored, 1=discovery, 2=back
	
	public Edge(Vertex<E> refDest) {
		this(refDest,-1);
	}
	
	public Edge (Vertex<E> refDest, int weight) {
		this.refDest=refDest;
		this.weight=weight; // inicializa el destino y el peso
	}
	
	public boolean equals(Object o) { // si la arista es igual a la que busco
		if(o instanceof Edge<?>) {
			Edge<E> e= (Edge <E>)o; // comparando la referen destino igual a la que vamos aisnertar
			return this.refDest.equals(e.refDest);
		}
		
		return false;
	}
	
	public String toString() { //grafo ponderado >-1
		if(this.weight >-1) return refDest.data+" ["+this.weight+"],";
		else return refDest.data+".";
	}

}
