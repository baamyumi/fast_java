package ch20;

class MyThread extends Thread{
	
	/* Thread ������� 1 : extends Thread */
	public void run() {
		int i;
		for(i = 1;i<200; i++) {
			System.out.print(i +"\t");
		}
	}
	
}

public class ThreadTest {

	public static void main(String[] args) {

		/* �� 3���� �����尡 �۵��ϴ� �� �� �� �ִ� > ���ν�����,th1,th2 */
		System.out.println(Thread.currentThread() + "start");
		MyThread th1 = new MyThread();
		MyThread th2 = new MyThread();
		
		th1.start();
		th2.start();
		System.out.println(Thread.currentThread() + "end");
	}

}
