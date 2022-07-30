package AssistedProject2;
class parent{  
void provide(){System.out.println("Has certain  charecteristics");}  
}  
class son extends parent{  
void son1(){System.out.println("son inherits some characterstics from parent");}  
}  
class daughter extends parent{  
void daughter1(){System.out.println("Daughter inherits some characterstics from parent");}  
}  
public class Oops_Pillar3{ // Inheritence
public static void main(String args[]){  
daughter c=new daughter();  
son d=new son();
parent p = new parent();
p.provide();
c.daughter1();
d.son1();
}
}  