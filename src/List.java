
public interface List<T> {
	
	// Get data stored in head node of list
	public T getFirst();
	
	// Get the head node of list
	public ListNode<T> getFirstNode();
	
	// Get data stored in tail node of list
	public T getLast();
	
	// Insert a new node with data at the head of the list
	public void insertFirst(T data);
	
	// Insert a new node with data after currentNode
	public void insertAfter(ListNode<T> currentNode, T data);
	
	// Insert a new node with data at the tail of list
	public void insertLast(T data);
	
	// Remove head node
	public void deleteFirst();
	
	// Remove tail node
	public void deleteLast();
	
	// Remove node following currentNode
	// If no node exists, do nothing
	public void deleteNext(ListNode<T> currentNode);
	
	// Get number of elements in list
	public int size();
	
	// Check if the list is empty
	public boolean isEmpty();
	
}
