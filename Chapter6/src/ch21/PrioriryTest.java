package ch21;

class PriorityThread extends Thread{
	public void run() {
		int sum = 0;
		
		Thread t = currentThread();
		System.out.println( t + "start");
		
		for(int i =0; i<=1000000; i++) {
			sum += i;
		}
		
		System.out.println(t.getPriority() + "end");
	}
}

public class PrioriryTest {

	public static void main(String[] args) {

		/*
		int i;
		
		for(i=Thread.MIN_PRIORITY; i<= Thread.MAX_PRIORITY; i++) {
			PriorityThread pt = new PriorityThread();
			pt.setPriority(i);
			pt.start();
		}
		*/
	
		////////////////////////////////////////////////
		
		PriorityThread pt1 = new PriorityThread();
		PriorityThread pt2 = new PriorityThread();
		PriorityThread pt3 = new PriorityThread();
		
		pt1.setPriority(Thread.MIN_PRIORITY);  //���� ���� ���������� �켱������ ���� ���� ����
		pt2.setPriority(Thread.NORM_PRIORITY); //normal priority
		pt3.setPriority(Thread.MAX_PRIORITY);  //���� �ʰ� ���������� �켱������ ���� ���� ����
		
		pt1.start();
		pt2.start();
		pt3.start();
	}

}
