package ch20;

class MyThreadTwo implements Runnable{

	/* Thread 생성방법 2 : implements Runnable */
	@Override
	public void run() {

		int i;
		for(i = 1;i<200; i++) {
			System.out.print(i +"\t");
		}
	}
	
}

public class ThreadTest2 {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread() + "start");
		
		MyThreadTwo runnable = new MyThreadTwo(); //runnable 객체 생성
		
		Thread th1 = new Thread(runnable);
		Thread th2 = new Thread(runnable);
		
		th1.start();
		th2.start();
		
		System.out.println(Thread.currentThread() + "end");
		
		/////////////////////////////////
		
		/* 익명 내부 클래스를 이용한 간단한 방법 */
		Runnable run = new Runnable() {
			
			@Override
			public void run() {

				System.out.println("run");
			}
		};
		
		run.run();
	}

}
