package AssistedProject2;
public class OOps_Pillar_5 { //Class Object
    
    String name; 
    int age; 
    String place; 
    public OOps_Pillar_5( String name ,int age, String place)
    { 
         
        this.name = name; 
        this.age = age; 
        this.place = place; 
    } 
    
    public String getname() 
    { 
        return name; 
    } 
    public int getage() 
    { 
        return age; 
    } 
    public String getplace() 
    { 
        return place; 
    } 
    @Override
    public String toString() 
    { 
        return(  "\nThe name is " + this.getname()+ " of age " + this.getage()+ ",from "+ this.getplace() + "."); 
    } 
    

	public static void main(String[] args) 
    { 
    	OOps_Pillar_5 scott = new OOps_Pillar_5("Manoj",21,"Chennai"); 
        System.out.println(scott.toString()); 
    } 
}