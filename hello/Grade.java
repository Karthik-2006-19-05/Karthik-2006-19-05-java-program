package hello;
import java.util.Scanner;

public class Grade {
      public static void main(String[] args) {
    	  Scanner sc = new Scanner(System.in);
    	  int n = sc.nextInt();
    	  int[] marks = new int[5];
    	  for(int i=0;i<n;i++) {
    		  marks[i]=sc.nextInt();
    	  }
    	  int topscore=marks[0];
    	  for(int i=1;i<5;i++) {
    		  if(marks[i]>topscore) {
    			  topscore=marks[i];
    		  }
    	  }
    	  for(int i=0;i<5;i++) {
    		  int diff = topscore - marks[i];
        	  if(diff<=5) {
        		  System.out.println("Grade O");
        	  }
        	  else if(diff<=10) {
        		  System.out.println("Grade A+");
        	  }
        	  else if(diff<=15) {
        		  System.out.println("Grade A");
        	  }
        	  else if(diff<=20){
        		  System.out.println("Grade B+");
        	  }
        	  else if(diff<=25) {
        		  System.out.println("Grade B");
        	  }
        	  else {
        		  System.out.println("Fail");
        	  }
    	  }
    	  sc.close();
      }
}
