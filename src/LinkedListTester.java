import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class LinkedListTester {

	@Test
	void test() {
		// Make an empty string list
		List<String> newList = new LinkedList<String>();
		// Test if it's empty
		assertEquals("empty test", true, newList.isEmpty());
		
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
		
		assertEquals("getLast test", "w", newList.getLast().toString());
		
		newList.deleteLast();
		
		assertEquals("deleteLast test", "e -> b", newList.toString());
		
	}

}
