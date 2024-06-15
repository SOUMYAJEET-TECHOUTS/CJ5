package javamethod;

class Help{
	int a;
	int b;
	
	Help(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	void Display()
	{
		System.out.println("a=" +a + " " +"b=" + b);
	}
}










public class ThisKeyword {
	public static void main(String[] args)
	{
		Help Obj = new Help(100,200);
		Obj.Display();
	}
                 
}
