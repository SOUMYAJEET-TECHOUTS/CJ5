package javamethod;



interface N1{
	final int a = 10;
	void display();
	
}

class Interface implements N1
{
	public void display()
	{
		System.out.println("Tech");
	}
}
public class InterfaceJava {
	public static void main (String[] args)
	{
		Interface p = new Interface();
		p.display();
		System.out.println(p.a);
	}

}
