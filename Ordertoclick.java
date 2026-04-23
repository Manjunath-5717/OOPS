 class Swiggy {
 void order() {
	 System.out.println("oreder from swiggy");
 }
}

class idli extends Swiggy{
	void order() {
		System.out.println("oreder idli");
	}
}

class chapati extends Swiggy{
	void order() {
		System.out.println("order chapati");
	}
}

class dosa extends Swiggy{
	void order() {
		System.out.println("oreder dosa");
	}
}

public class Ordertoclick{
	static void order(Swiggy s1) {
		s1.order();
	}
    
    public static void main(String[] args) {
	idli i1=new idli();
	chapati c1=new chapati();
	dosa d1=new dosa();

	order(i1);
	order(c1);
	order(d1);
}
}



