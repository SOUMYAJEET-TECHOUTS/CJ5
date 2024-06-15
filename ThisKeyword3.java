package javamethod;

class Local {
    int a;
    int b;
 
   
    Local()
    {
        a = 40;
        b = 50;
    }
 
   
    void display(Local obj)
    {
        System.out.println("a = " + obj.a
                           + "  b = " + obj.b);
    }
 
    
    void get() {
    	
    	display(this);
    	
    	}
    

    
}
public class ThisKeyword3 {
	
	public static void main(String[] args)
    {
		Local object = new Local();
        object.get();
    }

}
