public class Mainn {
    public static void main(String[] args) {
      Simulator.Simu(new Dog());
    }
}
class Simulator{
    static void Simu(Animal a1){
        a1.noise();
    }
}
class Animal{
    void noise(){
        System.out.println("sssssjhs");
    }
}

class Cat extends Animal{
    void noise(){
        System.out.println("mew");
    }
}

class Dog extends Animal{
    void noise(){
        System.out.println("bow bow");
    }
}

class Sneak extends Animal{
    void noise(){
        System.out.println("zzznz z ");
    }
}