package javamethod;

 class StaticBinding {

	 
	 public static class Main{
		 static void print() {
			 System.out.println("Hey this is Soumya");
		 }
	 }
	 
	 public static class Sub{
		 static void print() {
			 System.out.print("From Techouts");
		 }
	 }
	 

	 public static void main (String[]args) {
		 
		 Main a = new Main();
		 Sub b = new Sub();
		 
		 a.print();
		 b.print();
	 }
}
