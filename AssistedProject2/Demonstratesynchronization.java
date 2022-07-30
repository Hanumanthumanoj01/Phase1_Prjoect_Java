package AssistedProject2;
class square{
	void print(int a ,Thread t) {
		
		synchronized(this) {
			for(int i=1;i<5;i++) {
				System.out.println(a*i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
class user1 extends Thread{
	square t;
	user1(square t){
		this.t=t;
		
	}
	public void run(){
		t.print(4,this);
	}
		
	}
class user2 extends Thread{
	square t;
	user2(square t){
		this.t=t;
		
	}
	public void run(){
		t.print(2,this);
	}
		
	}
public class Demonstratesynchronization {
	public static void main(String[] args) {
		square obj=new square();
		user1 t1 = new user1(obj);
		user2 t2 = new user2(obj);
		t1.start();
		t2.start();
		
	}

}