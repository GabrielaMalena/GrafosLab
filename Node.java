
public class Node<Type> {
	protected Type data;
	protected Node<Type> next;
	
	public Node(Type data) {
		this.data=data;
		this.next=null;
	}
	
	public Node (Type data, Node<Type> next) {
		this.data=data;
		this.next=next;
	}
	
	public Type getData() {return data;}
	public Node<Type> getNext(){ return next;}
	public void setData (Type data) {this.data=data;}
	public void setNext(Node<Type> next) {this.next=next;}

	

}
