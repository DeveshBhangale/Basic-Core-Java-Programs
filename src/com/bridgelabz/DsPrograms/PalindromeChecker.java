package com.bridgelabz.DsPrograms;

public class PalindromeChecker<K> {
	private INode<K> head;
	private INode<K> tail;
	
	public PalindromeChecker() {
		this.head = null;
		this.tail = null;	
	}
	
	private void add(INode<K> myNode) {
		if (head==null) head = myNode;
		if (tail==null) tail = myNode;
		else {
			INode<K> tempNode = head;
			head = myNode;
			head.setNext(tempNode);
		}
	}
	
	private void append(INode<K> myNode) {
		if (head==null) head = myNode;
		if (tail==null) tail = myNode;
		else {
			tail.setNext(myNode);
			tail=myNode;
		}
	}
	
	public void addFront(INode<K> myNode) {
		append(myNode);
	}
	
	public void addRear(INode<K> myNode) {
		add(myNode);
	}
	public void print() {
		INode<K> tempNode = head;
		StringBuffer str = new StringBuffer("My Nodes: ");
		while(tempNode != null) {
			str.append(tempNode.getKey());
			if(!tempNode.equals(tail))
				 str.append("->");
			tempNode = tempNode.getNext();
		}
		System.out.println(str);
	}
	
	public String removeFront() {
		String rev = "";
		while(head.getNext()!=null) {
			rev+=String.valueOf(head.getKey());
			INode<K> temp = head.getNext();
			head = temp;
		}
		rev+=String.valueOf(head.getKey());
		return rev;
	}
	
	public String removeRear() {
		String rev = "";
		
		while (head.getNext()!=null) {
			INode<K> tempNode = head;
			while(tempNode.getNext().getNext()!=null) {
				tempNode= tempNode.getNext();
			}
			rev+=String.valueOf(tempNode.getNext().getKey());
			tempNode.setNext(null);
		}
		rev+=String.valueOf(head.getKey());
		
		return rev;
	}
}
