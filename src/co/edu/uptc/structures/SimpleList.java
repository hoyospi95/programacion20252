package co.edu.uptc.structures;

public class SimpleList<T> {
	private Node<T> head;
	
	public boolean add(T value) {
		boolean added = false;
		if(head == null){
			head = new Node<T>(value);
		}else{
			Node<T> actual = head;
		}
		return added;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
}
