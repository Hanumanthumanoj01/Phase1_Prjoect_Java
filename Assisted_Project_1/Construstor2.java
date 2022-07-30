package Git;
//parameterized constructor
class Std{
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
		System.out.println(id+" "+name);
	}
}

public class Construstor2 {
public static void main(String[] args) {

	Std std1=new Std(1,"Manoj");
	Std std2=new Std(03,"vaishu");
	std1.display();
	std2.display();
		}
}