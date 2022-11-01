package ch21;

public class JoinTest extends Thread {
	
	int start;
	int end;
	int total;  //멤버변수는 초기화하지않아도 0으로 초기화됨!
	
	public JoinTest(int start, int end) {
		this.start = start;
		this.end  = end;
	}
	
	public void run() {
		
		int i;
		for(i = start; i <= end; i++){
			total += i;
		}
	}

	public static void main(String[] args) {

		JoinTest jt1 = new JoinTest(1,  50);
		JoinTest jt2 = new JoinTest(51,  100);
		
		jt1.start();
		jt2.start();
		
		try {
			//jt1,jt2에 join을 걸어서 메인스레드가 non-runnable상태로 빠짐.
			jt1.join();
			jt2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//jt1, jt2 스레드의 수행을 기다려서 lastTotal로 만든다.
		int lastTotal = jt1.total + jt2.total;
		
		System.out.println("jt1.total = " + jt1.total);
		System.out.println("jt2.total = " + jt2.total);
		
		System.out.println("lastTotal = " + lastTotal);
	}

}
