
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
		while (lastNode.getNextNode() != null) {
			lastNode = lastNode.getNextNode();
		}
		return lastNode.getData();
	}

	@Override
	public void insertFirst(T data) {
		ListNode<T> node = new ListNode<T>(data);
		node.setNextNode(head);
		head = node;
	}

	@Override
	public void insertAfter(ListNode<T> currentNode, T data) {
		ListNode<T> node = new ListNode<T>(data);
		node.setNextNode(currentNode.getNextNode());
		currentNode.setNextNode(node);
	}

	@Override
	public void insertLast(T data) {
		
		ListNode<T> node = new ListNode<T>(data);
		if (isEmpty()) {
			head = node;
			return;
		}
		ListNode<T> lastNode = head;
		while (lastNode.getNextNode() != null) {
			lastNode = lastNode.getNextNode();
		}
		
		lastNode.setNextNode(node);
	}

	@Override
	public void deleteFirst() {
		if (isEmpty()) {
			return;
		}
		head = head.getNextNode();
	}

	@Override
	public void deleteLast() {
		if (isEmpty()) {
			return;
		}
		ListNode<T> secondLastNode = head;
		while (secondLastNode.getNextNode() != null) {
			if (secondLastNode.getNextNode().getNextNode() == null) {
				secondLastNode.setNextNode(null);
			} else {
				secondLastNode = secondLastNode.getNextNode();
			}
		}
	}

	@Override
	public void deleteNext(ListNode<T> currentNode) {
		
		ListNode<T> nextNode = currentNode.getNextNode();
		
		if (nextNode != null) {
			currentNode.setNextNode(nextNode.getNextNode());
		}
	}

	@Override
	public int size() {
		if (isEmpty()) {
			return 0;
		}
		int count = 0;
		ListNode<T> node = head;
		while (node.getNextNode() != null) {
			node = node.getNextNode();
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
}
