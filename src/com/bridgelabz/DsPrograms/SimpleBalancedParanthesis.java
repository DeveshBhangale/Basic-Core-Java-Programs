package com.bridgelabz.DsPrograms;

import java.util.Scanner;

public class SimpleBalancedParanthesis<K> {
	private INode<K> head;
	private INode<K> tail;
	
	public SimpleBalancedParanthesis() {
		
		this.head = null;
		this.tail = null;
	}
	
	public void add(INode<K> myNode) {
		if (this.head == null) {
			this.head = myNode;
		}
		if (this.tail == null) {
			this.tail = myNode;
		}
		else {
			tail.setNext(myNode);
			tail = myNode;
		}
	}
	
	public void push(INode<K> myNode) {
		add(myNode);
	}
	
	public void peek() {
		System.out.println(tail.getKey());
	}
	
	public void pop() {
		try {		
			head = head.getNext();
		}
		catch (Exception NullPointerException){
			push(new MyNode(')'));
		}
	}
	
	public int size() {
		int i =0;
		INode<K> tempNode = head;
		while (tempNode != null) {
			i++;
			tempNode = tempNode.getNext();
		}
		return i;
	}
	
	public boolean isEmpty() {
		if ( this.size()==0 ) return true;
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SimpleBalancedParanthesis<Object> obj = new  SimpleBalancedParanthesis<>();
		String expression= "(5+6)*(7+8)/(4+3)(5+6)*(7+8)(4+3)";
		for (int i=0;i<expression.length();i++) {
			char exp = expression.charAt(i);
			if ( exp == '(' ){
				MyNode newAdd = new MyNode(exp);
				obj.push(newAdd);
			}
			else if ( exp == ')' ) {
				obj.pop();
			}
		}
		
		if (obj.isEmpty()) {
			System.out.println("The Arithmetic Expression is balanced.");
		}
		else {
			System.out.println("Arithmetic Expression isn't balanced as it has " + obj.size() + " elements.");
		}
	}

	}

