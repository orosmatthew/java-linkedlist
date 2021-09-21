
public class LinkedListNode<T> {
	
	// data stored in node
	private T data;
	
	// the next node that this node points to
	private LinkedListNode<T> next;
	
	// constructor takes in data
	public LinkedListNode(T data) {
		this.setData(data);
	}
	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public LinkedListNode<T> getNext() {
		return next;
	}

	public void setNext(LinkedListNode<T> nextNode) {
		this.next = nextNode;
	}
	
}
