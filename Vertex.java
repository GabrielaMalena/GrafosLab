
public class Vertex<E> {
	protected E data;
	protected ListLinked<Edge<E>> listAdj;// lista enlazada guarda aristas
	protected int label; //0=unexplored, 1=visited
	
	public Vertex(E data) { // agrego vertices
		this.data=data;
		listAdj= new ListLinked<Edge<E>>();
	}
	
	public boolean equals(Object o) {// comparar atributos
		if(o instanceof Vertex<?>) {
			Vertex<E> v= (Vertex<E>)o;
			return this.data.equals(v.data);
		}
		return false;
	}
	
	public String toString() {// concatenar vertie y la info de la lista enlazada
		return this.data+"---->"+ this.listAdj.toString()+"\n";
		
	}

}
