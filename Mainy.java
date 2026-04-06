public class Mainy {
    public static void main(String[] args) {
        simulatorr.summ(new Laptop());
        simulatorr.summ(new Phone());
        simulatorr.summ(new radio());
    }
}
class simulatorr{
   static void summ(LG l1){
    l1.buy();
   }
}

class LG{
    void buy(){
        System.out.println("buying at LG shop");
    }
}
class Laptop extends LG{
    void buy(){
        System.out.println("buying a laptop at Lg shop");
    }
}

class Phone extends LG{
    void buy(){
        System.out.println("buying a phone at Lg shop");
    }
}

class radio extends LG{
    void buy(){
        System.out.println("buying a radio at LG");
    }
}