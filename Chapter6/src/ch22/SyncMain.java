package ch22;

class Bank{ //공유자원
	
	private int money = 10000;

	public synchronized void saveMoney(int save) {  //synchronized 메서드 :: 이 메서드가 포함된 객체(Bank)에 lock을 건다.
		int m = getMoney();
		
		try {
			Thread.sleep(3000); //Thread의 static 메서드
		} catch (InterruptedException e) {
			e.printStackTrace();
		}  
		
		setMoney(m+ save);
	}
	
	public void minusMoney(int minus) {
		
		synchronized (this) { //synchronized 블럭 :: 아래 수행문이 수행되는 동안 ()안의 객체에 lock을 건다. (현재 lock을 걸 객체는 Bank이므로 this)
			
			int m = getMoney();
			
			try {
				Thread.sleep(200); //Thread의 static 메서드
			} catch (InterruptedException e) {
				e.printStackTrace();
			}  
			
			setMoney(m- minus);
		}
		
	}
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	
}

class Park extends Thread{
	public void run() {
		System.out.println("start save");
		SyncMain.myBank.saveMoney(3000);
		System.out.println("saveMoney(3000) : "+ SyncMain.myBank.getMoney());
	}
}

class ParkWife extends Thread{
	public void run() {
		System.out.println("start minus");
		SyncMain.myBank.minusMoney(1000);
		System.out.println("minusMoney(1000) : "+ SyncMain.myBank.getMoney());
	}
}

public class SyncMain {

	public static Bank myBank = new Bank(); 
	
	public static void main(String[] args) {

		Park p = new Park();
		p.start();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		ParkWife pw = new ParkWife();
		pw.start();
		
	}

}
