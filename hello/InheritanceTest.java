package hello;
class A1{
	int a = 10;
	void display1()
	{
		System.out.println(a);
	}
}
class B1 extends A1{
	int b = 20;
	void display2() {
		System.out.println(b);
	}
}
public class InheritanceTest {
     public static void main(String[] args) {
    	 B1 b1 = new B1();
    	 b1.display1();
    	 b1.display2();
     }
}
