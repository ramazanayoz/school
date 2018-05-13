package generics;

public class Node<T> extends Box<T> {

	private Node<T> next;

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	
	
}
