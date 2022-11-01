package ch05;

import ch03.MyLinkedList;
import ch03.MyListNode;

interface MyQueue{
	
	public void enQueue(String data);
	public String deQueue();
	public void printQueue();
}

public class MyLinkedQueue extends MyLinkedList implements MyQueue{

	MyListNode front;
	MyListNode rear;
	
	@Override
	public void enQueue(String data) {
		MyListNode newNode;
		if(isEmpty()) {
			newNode = addElement(data);
			front = newNode;
			rear = newNode;
		}
		else {
			newNode = addElement(data);
			rear = newNode;
		}
		
		System.out.println(newNode.getDate()+" added");
	}

	@Override
	public String deQueue() {
		if(isEmpty()) {
			return null;
		}
		String data = front.getDate();
		front = front.next;
		if(front == null) {
			rear = null;
		}
		return data;
	}

	@Override
	public void printQueue() {
		printAll();
	}

}
