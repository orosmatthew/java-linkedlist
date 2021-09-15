
public class LinkedList<T> implements List<T> {
	
	private ListNode<T> head;
	
	@Override
	public T getFirst() {
		if (isEmpty()) {
			return null;
		}
		return head.getData();
	}

	@Override
	public ListNode<T> getFirstNode() {
		return head;
	}

	@Override
	public T getLast() {
		if (isEmpty()) {
			return null;
		}
		
		ListNode<T> lastNode = head;
		while (lastNode.getNext() != null) {
			lastNode = lastNode.getNext();
		}
		return lastNode.getData();
	}

	@Override
	public void insertFirst(T data) {
		ListNode<T> node = new ListNode<T>(data);
		node.setNext(head);
		head = node;
	}

	@Override
	public void insertAfter(ListNode<T> currentNode, T data) {
		ListNode<T> node = new ListNode<T>(data);
		node.setNext(currentNode.getNext());
		currentNode.setNext(node);
	}

	@Override
	public void insertLast(T data) {
		
		ListNode<T> node = new ListNode<T>(data);
		if (isEmpty()) {
			head = node;
			return;
		}
		ListNode<T> lastNode = head;
		while (lastNode.getNext() != null) {
			lastNode = lastNode.getNext();
		}
		
		lastNode.setNext(node);
	}

	@Override
	public void deleteFirst() {
		if (isEmpty()) {
			return;
		}
		head = head.getNext();
	}

	@Override
	public void deleteLast() {
		if (isEmpty()) {
			return;
		}
		ListNode<T> secondLastNode = head;
		while (secondLastNode.getNext() != null) {
			if (secondLastNode.getNext().getNext() == null) {
				secondLastNode.setNext(null);
			} else {
				secondLastNode = secondLastNode.getNext();
			}
		}
	}

	@Override
	public void deleteNext(ListNode<T> currentNode) {
		
		ListNode<T> nextNode = currentNode.getNext();
		
		if (nextNode != null) {
			currentNode.setNext(nextNode.getNext());
		}
	}

	@Override
	public int size() {
		if (isEmpty()) {
			return 0;
		}
		int count = 0;
		ListNode<T> node = head;
		while (node.getNext() != null) {
			node = node.getNext();
			count++;
		}
		return count;
	}

	@Override
	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		if (isEmpty()) {
			return "";
		}
		
		ListNode<T> lastNode = head;
		
		String string = head.getData().toString();
		
		while (lastNode.getNext() != null) {
			lastNode = lastNode.getNext();
			string += " -> " + lastNode.getData().toString();
		}
		return string;
	}
}
