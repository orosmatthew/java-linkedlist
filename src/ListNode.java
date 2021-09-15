
public class ListNode<T> {
	
	// data stored in node
	private T data;
	
	// the next node that this node points to
	private ListNode<T> nextNode;
	
	// constructor takes in data
	public ListNode(T data) {
		this.setData(data);
	}
	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public ListNode<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(ListNode<T> nextNode) {
		this.nextNode = nextNode;
	}
	
}
