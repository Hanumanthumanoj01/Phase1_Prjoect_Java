package AssistedProject2;

interface A{  
void a();  
void b();  
  
}  
  
abstract class B implements A{  
public void c(){System.out.println("I am c");}  
}  
  
class c extends B{  
public void a(){System.out.println("value of a = 34");}  
public void b(){System.out.println("value of b = 3");}  
  
}  
  
class abstraction{  
public static void main(String args[]){  
A obj=new c();  
obj.a();  
obj.b();  
  
}} 