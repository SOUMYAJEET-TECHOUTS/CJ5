package javamethod;




class Helper{
	static int Add(int a , int b)
	{
	return a + b;
	}
	static double Add(double a, double b, double c){
		return a + b + c;
	}
}

public class Polymorphism {
	public static void main(String[] args) {
		System.out.println(Helper.Add(2, 4));
        System.out.println(Helper.Add(2.5, 7.6, 3.3));
	}

}
