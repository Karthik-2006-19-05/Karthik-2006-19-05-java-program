package hello;

public class Student {
       private int id;
       private String name;
       
       public Student(int id, String name) {
    	   this.id = id;
    	   this.name = name;
       }
       public void display() {
    	   System.out.println(id);
    	   System.out.println(name);
       }
       public static void main(String[] args) {
    	   Student student = new Student(1,"Ram");
    	   student.display();
       }
}
