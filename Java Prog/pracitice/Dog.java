package pracitice;

public class Dog extends Animal{
void sound() {
	System.out.println("barking");
}
	public static void main(String[] args) {
	
		Animal a=new Dog();
		if(a instanceof Dog) {
		Dog d=(Dog)a;
		d.sound();
		}
	}
}
