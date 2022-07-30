package AssistedProject2;
class table{
	void set(int a ) {
		System.out.println("THE output is "+a*a);
	}
	
}
class value1 extends Thread{
	table t;
	value1(table t){
		this.t=t;
	}
	public void run() {
		 t.set(34);
	}
}
class value2 extends Thread{
	table t;
	value2(table t){
		this.t=t;
	}
	public void run() {
		 t.set(4);
	}
}
class value3 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}

public class ThreadClassImplementingRunnable{
	public static void main(String[] args) {
	table obj=new table();
	value1 t1= new value1(obj);
	value2 t2 = new value2(obj);
	t1.start();
	t2.start();
	
	
	
	}
}