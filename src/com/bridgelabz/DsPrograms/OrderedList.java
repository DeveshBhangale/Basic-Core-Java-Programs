package com.bridgelabz.DsPrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class OrderedList<K> {
	
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
			if(tempNode == null) {
				INode<K> temp = new MyNode(myNode);
				System.out.println("Node not found created one ..");
				tail.setNext(temp);
				tail = temp;
			}
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
	
	public int size() {
		int i = 0;
		INode<K> tempNode = this.head;
		while(tempNode != null) {
			tempNode = tempNode.getNext();
			i++;
		}
		return i;
	}
	
	public static String[] sortArray(String arr[]) {
		int size = arr.length;
		String temp;
		for(int i=0;i<size-1;i++) {
			for (int j=i+1;j<arr.length;j++) {
				if(arr[i].compareTo(arr[j])>0) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	
	
	
	public void sort() {
		String arr[] = new String[(int)size()];
		int i = 0;
		INode<K> tempNode = this.head;
		while(tempNode != null) {
			arr[i] = (String)tempNode.getKey();
			i++;
			tempNode = tempNode.getNext();
		}
		arr = sortArray(arr);
		head = null;
		tail = null;
		int size = arr.length;
		for(int j=0;j<size;j++) {
			add(new MyNode(arr[j]));
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		File file = new File("C:\\text.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		OrderedList<String> l1 = new OrderedList<>();
		String st;
		while ((st = br.readLine()) != null) {
				String[] words = st.toLowerCase().split(" ");
				
				for(String word: words) {
						l1.add(new MyNode(word));
				}
			
			
		}
		l1.print();
		System.out.println(l1.size());
		l1.sort();
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
