abstract class Puma {
    public abstract void shoe();

    void shirts() {
        System.out.println("shirts");
    }
}

public class Mainclass extends Puma {
    @Override
    public void shoe() {
        System.out.println("shoes");
    }

    public static void main(String[] args) {
        Mainclass m = new Mainclass();
        m.shoe();
        m.shirts();
    }
}
