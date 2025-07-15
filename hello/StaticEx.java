package hello;

public class StaticEx {
     private static int a = 0;
     private int b;
     
     public void set(int i,int j) {
    	 a=i;
    	 b=j;
     }
     public void show() {
    	 System.out.println("This is static a: "+a);
    	 System.out.println("This is non-static b:"+b);
     }
     public static void main(String[] args) {
    	 StaticEx x = new StaticEx();
    	 StaticEx y = new StaticEx();
    	 x.set(1, 1);
    	 x.show();
    	 
    	 y.set(2, 2);
    	 y.show();
    	 
    	 x.show();
     }
}
