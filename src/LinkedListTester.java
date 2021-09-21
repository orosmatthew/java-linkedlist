import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class LinkedListTester {

	@Test
	void test() {
		// Make an empty string list
		List<String> newList = new LinkedList<String>();
		// Test if it's empty
		assertEquals("empty test", true, newList.isEmpty());
		
		// Test various methods while list is empty
		assertEquals("getLast with empty list test", null, newList.getLast());
		assertEquals("getFirst with empty list test", null, newList.getFirst());
		assertEquals("getFirstNode with empty list test", null, newList.getFirstNode());
		assertEquals("size of 0 with empty list test", 0, newList.size());
		
		// Add an w at the beginning
		newList.insertFirst("w");
		// Test to see if it showed up
		assertEquals("insertFirst with empty list test", "w", newList.toString());
		
		// Add a b at the beginning
		newList.insertFirst("b");
		// Test to see if it showed up
		assertEquals("insertFirst test", "b -> w", newList.toString());
		
		// Add an e at the beginning
		newList.insertFirst("e");
		// Test to see if it showed up
		assertEquals("insertFirst with 2 items test", "e -> b -> w", newList.toString());
		
		// Test to see if e is at the beginning
		assertEquals("getFirst test", "e", newList.getFirst().toString());
		
		// Test to see if w is at the end
		assertEquals("getLast test", "w", newList.getLast().toString());
		
		// Test if delete last works
		newList.deleteLast();
		assertEquals("deleteLast test", "e -> b", newList.toString());
		
		// Test if getting first node contains correct data
		LinkedListNode<String> firstNode = newList.getFirstNode();
		assertEquals("getFirstNode test", "e", firstNode.getData().toString());
		
		// Test if insert after places p in correct location
		newList.insertAfter(firstNode, "p");
		assertEquals("insertAfter test", "e -> p -> b", newList.toString());
		
		// Test if k is placed at the end of the list
		newList.insertLast("k");
		assertEquals("insertLast test", "e -> p -> b -> k", newList.toString());
		
		// Test if first node was deleted correctly
		newList.deleteFirst();
		assertEquals("deleteFirst test", "p -> b -> k", newList.toString());
		
		// Test if node after first node was deleted correctly
		LinkedListNode<String> newFirstNode = newList.getFirstNode();
		newList.deleteNext(newFirstNode);
		assertEquals("deleteNext test", "p -> k", newList.toString());
		
		// Test if size returns 2 for 2 elements in the list
		assertEquals("size test", 2, newList.size());
		
		// Test if list is empty, should be false
		assertEquals("isEmpty test", false, newList.isEmpty());
	}

}
