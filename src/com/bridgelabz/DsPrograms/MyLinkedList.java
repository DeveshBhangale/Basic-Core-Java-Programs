package com.bridgelabz.DsPrograms;


public class MyLinkedList<K> {
	
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
			INode<K> tempNode = head;
			head = newNode;
			head.setNext(tempNode);
		}		
	}
	
	public void insertNode(int index, INode<K> newNode) {
		int cnt=0;
		INode<K> tempNode = head;
		while(cnt == index) {
			tempNode = tempNode.getNext();
			cnt++;
		}
		INode<K> next = tempNode.getNext();
		tempNode.setNext(newNode);
		newNode.setNext(next);
	}
	
	public void insertNodeAfterSpecificValue(int myNode,INode<K> newNode) {
		INode<K> tempNode = head;
		while(tempNode != null) {
			if((Integer)tempNode.getKey() == myNode) {
				INode<K> next = tempNode.getNext();
				tempNode.setNext(newNode);
				newNode.setNext(next);
				if(tempNode.equals(tail)) {
					tail = newNode;
				}
				break;
			}
			tempNode = tempNode.getNext();
		}
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
	
	public void delete(int myNode) {
		INode<K> tempNode = this.head;
		while(tempNode != null) {
			if((Integer)tempNode.getNext().getKey() == myNode) {
				INode<K> temp = tempNode.getNext().getNext();
				tempNode.setNext(temp);
				break;
			}
			tempNode = tempNode.getNext();
		}
	}
	
	public void pop() {
		INode<K> tempNode = this.head;
		this.head = head.getNext();
	}
	
	public void popLast() {
		INode<K> tempNode = this.head;
		while(!tempNode.getNext().equals(tail)) {
			tempNode = tempNode.getNext();
		}
		tail = tempNode;
		tempNode.setNext(null);	
	}
	
	public void searchNode(int myNode){
		int index = 0;
		INode<K> tempNode = this.head;
		while(tempNode != null) {
			if((Integer)tempNode.getKey() == myNode) {
				System.out.println((myNode + " key found at Index "+index));
				break;
			}
			tempNode = tempNode.getNext();
			index++;			
		} 
	}
	
	public static void swap(int[] arr, int i, int j)
	{
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}
	
	public static int split(int[] arr, int l, int h)
	{
		int pivot = arr[h]; 
	    int i = (l - 1); 
	    for(int j = l; j <= h - 1; j++)
	    {
	        if (arr[j] < pivot) 
	        {
	            i++; 
	            swap(arr, i, j);
	        }
	    }
	    swap(arr, i + 1, h);
	    return (i + 1);
	}
	
	public static void quickSort(int[] arr, int l, int h)
	{
	    if (l< h) 
	    {
	        int sp = split(arr, l, h);
	        quickSort(arr, l, sp - 1);
	        quickSort(arr, sp + 1, h);
	    }
	}
	
	public void sort() {
		int arr[] = new int[20];
		int i = 0;
		INode<K> tempNode = this.head;
		while(tempNode != null) {
			arr[i] = (Integer)tempNode.getKey();
			i++;
			tempNode = tempNode.getNext();
		}
		quickSort(arr, 0, arr.length - 1);
		StringBuffer str1 = new StringBuffer("My Nodes: ");
		for(int j=0;j<20;j++) {
			if(arr[j] != 0 && j!=19) {
				str1.append(arr[j]+ "->");
			}
		} 
		if(arr[19]!=0)
			str1.append(arr[19]);
		System.out.println(str1);
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

}
