package javamethod;


class Parent{
	void print()
	{
		System.out.println("Hello");
	}
}
class Sub2 extends Parent{
	void print() {
		System.out.println("How are you");
	}
}
class Sub3 extends Parent{
	void print() {
		System.out.println("Where are you from");
	}
}

public class RunTimePoly {
               public static void main(String[] args)
               {
            	   Parent a;
            	   a = new Parent();
            	   a.print();
            	   
            	   a = new Sub2();
            	   a.print();
            	   
            	   a = new Sub3();
            	   a.print();
               }
}
