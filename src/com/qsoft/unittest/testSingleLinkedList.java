package com.qsoft.unittest;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import com.qsoft.Node;
import com.qsoft.SingleLinkedList;

public class testSingleLinkedList extends TestCase {
	// 1
	public void testNewSingleLinkedListWithEmptyList() {
		List<Node> nodes = new ArrayList<Node>();
		SingleLinkedList singleLinkedList = new SingleLinkedList(nodes);
		assertTrue(singleLinkedList.getLists().isEmpty());
	}

	// 2
	public void testNewSingleLinkedListWithObjectList() {
		List<Node> nodes = createNotes();
		SingleLinkedList singleLinkedList = new SingleLinkedList(nodes);
		assertEquals(nodes, singleLinkedList.getLists());
	}

	// 3
	public void testGetSizeOfSingleLinkedList() {
		List<Node> nodes = createNotes();
		SingleLinkedList singleLinkedList = new SingleLinkedList(nodes);
		assertTrue(nodes.size() == singleLinkedList.size());
	}

	// 4
	public void testInsertAfterIndexN() {
		List<Node> nodes = createNotes();
		SingleLinkedList list = new SingleLinkedList(nodes);

		int n = 2;
		Node node = new Node();
		node.setValue("value 1");
		

		list.insertAfter(node, n);
	}

	private List<Node> createNotes() {
		List<Node> nodes = new ArrayList<Node>();
		int n = 6;
		for (int i = 0; i < n; i++) {
			Node node = new Node();
			node.setValue("value " + i);
			
			nodes.add(node);
		}
		return nodes;
	}
}
