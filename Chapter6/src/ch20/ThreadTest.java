package ch20;

class MyThread extends Thread{
	
	/* Thread 생성방법 1 : extends Thread */
	public void run() {
		int i;
		for(i = 1;i<200; i++) {
			System.out.print(i +"\t");
		}
	}
	
}

public class ThreadTest {

	public static void main(String[] args) {

		/* 총 3개의 스레드가 작동하는 걸 알 수 있다 > 메인스레드,th1,th2 */
		System.out.println(Thread.currentThread() + "start");
		MyThread th1 = new MyThread();
		MyThread th2 = new MyThread();
		
		th1.start();
		th2.start();
		System.out.println(Thread.currentThread() + "end");
	}

}
