package javamethod;


abstract class It {
    abstract void printInfo();
}

class Employee extends It {
    void printInfo()
    {
        String name = "Soumyajeet";
        int age = 23;
        float salary = 9.1F;
 
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}
 



public class AbstractclassTest {

    public static void main(String args[])
    {
       It s = new Employee();
        s.printInfo();
    }

}
