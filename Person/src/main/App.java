package main;

import entities.Person;
import utils.PersonManager;

public class App {
	public static void main(String[] args) {

		Person bob = new Person();
		bob.setName("Bob");
		bob.setAge(70);
		bob.setJobTitle("Bin man");
		System.out.println(bob.details()); 
		
		Person dave = new Person();
		dave.setName("Dave");
		dave.setAge(41);
		dave.setJobTitle("Software Engineer");
		System.out.println(dave.details());
		
		Person alfred = new Person();
		alfred.setName("Alfred");
		alfred.setAge(80);
		alfred.setJobTitle("Butler");
		System.out.println(alfred.details());
		
	
		PersonManager manager1 = new PersonManager(bob, dave, alfred);
		
		String name = "bob";
		
		Person result = manager1.search(name);
		if(result==null) {
			System.out.println(name + " not found");
		}
		else {
			System.out.println(name + " found");
	}

	}
}