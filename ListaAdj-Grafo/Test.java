package ListaAdyacencia;

public class Test{
public static void main(String args[]){

	GrafoListAdj<String> g = new GrafoListAdj<String>();
	g.addEdge("lima", "aqp", true);
	g.addEdge("ica", "tarapoto", true);
	g.addEdge("camana", "piura", true);
	//g.addEdge("piura", "camana", true);
	g.addEdge("tumbes", "chiclayo", true);
	g.addEdge("Iquitos", "Ayacucho", true);
	//g.addEdge(3, 4, true);

	System.out.println("Graph:\n" + g.toString());

	g.getVertexCount();
	g.getEdgesCount(true);
	g.hasEdge("piura", "camana");
	g.hasVertex("lima");
	}
}
