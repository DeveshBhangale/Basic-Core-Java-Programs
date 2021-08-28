package com.bridgelabz.DsPrograms;

import java.io.*;

import java.util.*;


public class UnOrderedList<K> {
	private INode<K> head;
	private INode<K> tail;
	
	public void add(INode<K> newNode) {
		if(tail == null) {
			tail = newNode;
		}
		if(head == null) {
			head = newNode;
		}
		else {
			
			tail.setNext(newNode);
			tail = newNode;
		}		
	}
	public void delete(String myNode) {
		INode<K> tempNode = head;
		if(tempNode.getKey().equals(myNode)) {
			head = tempNode.getNext();
			tempNode.setNext(tempNode.getNext());
		}else {
			while(tempNode != null) {
				if(tempNode.getNext().getKey().equals(myNode)) {
					if(tempNode.getNext().equals(tail)) {
						tail = tempNode;
						tempNode.setNext(null);
						break;
					}
					tempNode.setNext(tempNode.getNext().getNext());
					break;
				}
				tempNode = tempNode.getNext();
					
				}
		}
	}
	
	public void searchNode(String myNode) {
		INode<K> tempNode = head;
		if(tempNode.getKey().equals(myNode)) {
			System.out.println(myNode + "is found");
		}
		else {
			while(tempNode != null) {
				if(tempNode.getKey().equals(myNode)) {
					System.out.println(myNode + " is found");
					break;
				}
				tempNode = tempNode.getNext();
			}
			INode<K> temp = new MyNode(myNode);
			System.out.println("Node not found created one ..");
			tail.setNext(temp);
			tail = temp;
			print();
		}
		
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
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		File file = new File("C:\\text.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		UnOrderedList<String> l1 = new UnOrderedList<>();
		String st;
		while ((st = br.readLine()) != null) {
				String[] words = st.toLowerCase().split(" ");
				
				for(String word: words) {
						l1.add(new MyNode(word));
				}
			
			
		}
		l1.print();
		
		System.out.println("Enter a word to delete from list: ");
		String node = sc.next();
		l1.delete(node);
		l1.print();
		System.out.println("Enter a word to search from list: ");
		node = sc.next();
		l1.searchNode(node);
		sc.close();
		br.close();
		}

}
