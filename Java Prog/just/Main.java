package just;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        while (true) {
            System.out.println("\n 1. Add Student");
            System.out.println("2. Display Student");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    s.addStudent();
                    break;
                case 2:
                    s.displayStudent();
                    break;
                case 3:
                    System.out.println("Exiting");
                    sc.close();
                    return; 
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}