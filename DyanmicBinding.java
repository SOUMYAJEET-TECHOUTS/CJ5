package javamethod;


class DyanmicBinding {
	 
	 public static class Main{
		 
		  void print() {
			 
			 System.out.println("Hey this is Soumya");
		 }
	 }
	 
	 public static class Sub extends Main {
		 
		@Override void print() {
			 
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
