package hello;

import java.util.Scanner;

public class Demo {
     public static void main(String args[]) {
    	 
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("Enter your regno:");
    	 int regno = sc.nextInt();
    	 
    	 System.out.println("Enter your name:");
    	 String name = sc.next();
    	 System.out.println(regno+""+name);
    	 System.out.println("Welcome");
     }
}
class Demo101{
	static int a;
}
public class Demo1{
	public static void main(String[] args) {
		System.out.println(Demo101.a);
	}
}