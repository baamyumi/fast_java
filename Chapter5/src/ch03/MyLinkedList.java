package ch03;

public class MyLinkedList {

	//연결리스트(LinkedList) 구현하기
	private MyListNode head;
	int count;
	
	public MyLinkedList() {
		head = null;
		count= 0;
	}
	
	public MyListNode addElement(String data) {
		MyListNode newNode;
		
		if(head == null) {
			newNode = new MyListNode(data);
			head = newNode;
		}
		else {
			newNode = new MyListNode(data);
			MyListNode temp = head;
			while( temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		
		count++;
		
		return newNode;
	}
	
	public MyListNode insertElement(int position, String data) {
		int i;
		MyListNode tempNode = head;
		MyListNode preNode = null;
		
		MyListNode newNode = new MyListNode(data);
		
		if(position < 0 || position > count) {
			return null;
		}
		
		if(position == 0) { //맨앞으로 들어가는 경우
			newNode.next = head;
			head = newNode;
		}
		else {
			for(i=0; i<position; i++) {
				preNode = tempNode;
				tempNode = tempNode.next;
			}
			
			newNode.next = preNode.next;
			preNode.next = newNode;
		}
		
		count++;
		return newNode;
	}
	
	public MyListNode removeElement(int position) {
		int i;
		
		MyListNode tempNode = head;
		MyListNode preNode = null;
		
		if(position == 0) {
			head = tempNode.next;
		}
		else {
			for(i=0; i<position; i++) {
				preNode = tempNode;
				tempNode = tempNode.next;
			}
			
			preNode.next = tempNode.next;
		}
		count--;
		
		return tempNode;
	}
	
	public void removeAll() {
		head = null;
		count = 0;
	}
	
	public int getSize() {
		return count;
	}
	
	public void printAll() {
		if(count==0) {
			System.out.println("출력할 내용이 없습니다.");
			return;
		}
		
		MyListNode temp = head;
		while(temp != null) {
			System.out.print(temp.getDate());
			temp = temp.next;
			if(temp!=null) {
				System.out.print("->");
			}
		}
		System.out.println("");
	}
	
	public boolean isEmpty() {
		if(head == null) return true;
		else return false;
	}
}
