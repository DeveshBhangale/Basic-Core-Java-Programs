package com.bridgelabz.DsPrograms;

import java.util.Scanner;

public class SimulateBankingCashCounter<K> {
	private INode<K> head;
	private INode<K> tail;
	
	public SimulateBankingCashCounter() {
		
		this.head = null;
		this.tail = null;
	}
	
	public void append(INode<K> myNode) {
		if (this.head == null) {
			this.head = myNode;
		}
		if (this.tail == null) {
			this.tail = myNode;
		}
		else {
			this.tail.setNext(myNode);
			this.tail = myNode;
		}
	}
	
	public void isEmpty() {
		if (head == null) {
			System.out.println("Queue is Empty");
		}
		else {
			System.out.println("There are elements in Queue");
		}
	}
	public void enQueue(INode<K> myNode) {
		append(myNode);
	}
	
	public void size() {
		int count = 0;
		while(head != null) {
			head = head.getNext();
			count++;
		}
		System.out.println("The Queue has "+ count + " elements.");
	}
	
	
	public void deQueue(Integer Balance) {
		Integer cash = 0;
		while(head != null) {
			System.out.println("People in the queue are: ");
			print();
			cash = BalanceAvailable(Balance); 
			if (Balance != cash) {
				Balance = cash;
				delete();
			};
		}
	}
	
	public Integer BalanceAvailable(Integer Balance) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter \n1.Deposit \n2.Withdraw: ");
		if (sc.nextInt() == 1) {
			Balance += sc.nextInt();
			System.out.println(Balance);
			System.out.println("Removed " + head.getKey() + " from queue.");
			sc.close();
			return Balance;
		}
		else {
			int check = sc.nextInt();
			if (check <= Balance) {
				Balance-=check;
				System.out.println(Balance);
				System.out.println("Removed " + head.getKey() + " from queue.");
				sc.close();
				return Balance;
			}
			else {
				System.out.println("Please withdraw amount less than " + Balance);
			}
		}
		sc.close();
		return Balance;
	}
	
	public void delete() {
		head = head.getNext();
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
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SimulateBankingCashCounter obj = new SimulateBankingCashCounter<>();
	
		int Balance = 10000;
		while(true) {
			System.out.println("Enter name of person: ");
			String name = sc.next();
			obj.enQueue(new MyNode(name));
			System.out.println("Enter \n 1.Add people to queue\n 2.exit");
			if (sc.nextInt() == 2) 
				break;
		}
		
		obj.deQueue(Balance);
		sc.close();

	}

}
