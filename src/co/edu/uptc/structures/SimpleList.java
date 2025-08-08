package co.edu.uptc.structures;

public class SimpleList<T> {
	private Node<T> head;
	
	public boolean add(T value) {
		boolean added = false;
		if(head == null){
			head = new Node<T>(value);
		}else{
			Node<T> actual = head;
			while(actual.getNext() != null){
				actual = actual.getNext();
			}
		}
		return added;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
}
