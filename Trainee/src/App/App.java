package App;

import trainee.Trainee;

public class App {
	public static void main(String[] args) {
		Trainee james = new Trainee(22, "James");
		james.setAge(140);
		james.setName("Luke");
		james.breathe();
		james.printDetails();
		
		Trainee matt = new Trainee(22, "Matt");
		
		matt.printDetails();
	}
}
