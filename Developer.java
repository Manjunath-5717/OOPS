public class Developer extends Employee{
    void action(){
        System.out.println("developr builds Application");

    }    
}

public static void main(String[] args) {
         Employee e1 = new Developer();
         e1.action();
    }
