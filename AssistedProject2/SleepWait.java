package AssistedProject2;
class Table1{
	private static Object LOCK = new Object();
	  void print(int n) throws InterruptedException{
		  
		  for (int i=1;i<=5;i++) {
			  Thread.sleep(1000);
			  System.out.println(n*i);
	  }
		  synchronized (LOCK)
		   {
			  LOCK.wait(1000);
			  System.out.println("Object '" + LOCK + "' is woken after" +" waiting for 1 second");
		  }
	  }
}
class Thread2 extends Thread{
	Table1 t;
	Thread2(Table1 t){
		this.t=t;
		
		
	}
	public void run() {
		try {
			t.print(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	
}

public class SleepWait{
	public static void main(String[]  args) {
		Table1 obj = new Table1();
		Thread2 t1=new Thread2(obj);
	t1.start();
	
	
	}
}