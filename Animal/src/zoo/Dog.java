package zoo;

public class Dog extends Mammal {
	
	public Dog() {
		this.setNoOfLegs(4);
		this.setNoOfEyes(2);
		this.setSciName("Doggo");
	}
	
	@Override
	public void move() {
		System.out.println("Walkies");
	}

	public void fetch() {
		System.out.println("Good boy");
	}

}
