package javamethod;



class Nod{
	private int value;
	
	public void setValue(int x)
	{
		value = x;
	}
	public int getValue()
	{
		return value;
	}
}

public class Encapsulation {
  public static void main(String[] args)
  {
	  Nod y = new Nod();
			  y.setValue(100);
			  System.out.println(y.getValue());
  }
}
