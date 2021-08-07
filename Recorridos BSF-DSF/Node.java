package BFSyDFS;

import java.util.ArrayList;
import java.util.List;

public class Node {
	
	int value;
	List<Node> vecinos;

	public Node(int value) {
		this.value = value;
		vecinos = new ArrayList<>();
	}
	
	public void addEdge(Node to) {
		vecinos.add(to);
	}
}
