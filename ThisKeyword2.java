package javamethod;

class Test {
    int a;
    int b;
 
    
    Test()
    {
        this(10,20);
        System.out.println("How Are you");
           
    }
 
    
    Test(int a, int b)
    {
        this.a = a;
        this.b = b;
        System.out.println("hello");
            
    }
 
    
}

public class ThisKeyword2
{
public static void main(String[] args)
    {
        Test object = new Test();
    }
}
