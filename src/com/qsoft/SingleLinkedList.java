package com.qsoft;

import java.util.List;

public class SingleLinkedList {
	private List<Node> lists;

	public SingleLinkedList(List<Node> nodes) {
		this.lists = nodes;
	}

	public List<Node> getLists() {
		return lists;
	}

	public int size() {

		return lists.size();
	}

	public void insertAfter(Node node, int n) {
		lists.add(n, node);
	}

}
