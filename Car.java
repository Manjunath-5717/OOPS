class Car extends Vehicle{
	String engine;

	public static void main(String[] args) {
		Car c=new Car();
		c.brand="bmw";
		c.color="black";
		c.price=5000000;
		c.engine="1100cc";

		System.out.println(c.color);
		System.out.println(c.brand);
		System.out.println(c.price);
		System.out.println(c.engine);
	}

}
