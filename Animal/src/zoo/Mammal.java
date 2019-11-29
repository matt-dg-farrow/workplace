package zoo;

public abstract class Mammal extends Animal {
	
	public Mammal() {
	}
	
	public Mammal(int noLegs, int noEyes, String sciName) {
		this.setNoOfLegs(noLegs);
		this.setNoOfEyes(noEyes);
		this.setSciName(sciName);
	}
	
	private int amountOfFur;

	public void lactate() {
		System.out.println("Got milk?");
	}

	public int getAmountOfFur() {
		return amountOfFur;
	}

	public void setAmountOfFur(int amountOfFur) {
		this.amountOfFur = amountOfFur;
	}

}
