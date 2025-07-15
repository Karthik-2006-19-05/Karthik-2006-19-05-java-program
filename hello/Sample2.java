package hello;

public class Sample2 {
      public void display1() {
    	  System.out.println("Method of display 1");
      }
      public void display2() {
    	  System.out.println("Method of display 2");
      }
      public void printDetails() {
    	  this.display1();
    	  this.display2();
      }
      public static void main(String[] args) {
    	  Sample2 sample2 = new Sample2();
    	  sample2.printDetails();
      }
      
}
