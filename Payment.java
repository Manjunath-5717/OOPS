class Pg{
	void rent() {
		System.out.println("due payment");
	}
}

class manju extends Pg{
	void rent() {
		System.out.println("payment paid by manju");
	}
}
class prashi extends Pg{
	void rent() {
		System.out.println("payment paid by prashi");
	}
}

class mitan extends Pg{
	void rent() {
		System.out.println("payment paid by mitan");
	}
}


public class Payment {
	static void rent(Pg p1) {
		p1.rent();
	}

	public static void main(String[] args) {
    mitan m1=new mitan();
    prashi p1=new prashi();
    manju m2=new manju();
    
    rent(p1);
    rent(m1);
    rent(m2);

	}

}
