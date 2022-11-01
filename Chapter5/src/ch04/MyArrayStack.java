package ch04;

import ch02.MyArray;

public class MyArrayStack {

	MyArray arrayStack;
	int top;
	
	public MyArrayStack() {
		top = 0;
		arrayStack = new MyArray();
	}
	
	public MyArrayStack(int size) {
		top = 0;
		arrayStack = new MyArray(size);
	}
	
	public void push(int data) {
		if(isFull()) {
			System.out.println("stack is full");
			return;
		}
		arrayStack.addElement(data);
		top++;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("stack is empty");
			return MyArray.ERROR_MIN;
		}
		return arrayStack.removeElement(--top);
	}
	
	public boolean isEmpty() {
		if(top ==0) {
			return true;
		}
		else return false;
	}
	
	public boolean isFull() {
		if(top == arrayStack.ARRAY_SIZE) {
			return true;
		}
		else return false;
	}
}
