package just;
import java.util.Scanner;

class Student extends Person implements StudentOperation  {
    private int id;   

    
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

   
    public void addStudent() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID :");
        id = sc.nextInt();
        
        sc.nextLine();
        
        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Age:");
        age = sc.nextInt();
    }

    
    public void displayStudent() {
    	System.out.println("\n Student Details");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}