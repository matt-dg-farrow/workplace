package main;

import java.util.ArrayList;
import java.util.List;

import zoo.Animal;
import zoo.Dog;
import zoo.Tiger;

public class App {

	public static void main(String[] args) {
		Dog animal1 = new Dog();
		animal1.move();

		Animal animal2 = new Tiger();
		animal2.move();

		List<Animal> zoo = new ArrayList<>();
		zoo.add(animal1);
		zoo.add(animal2);
		for (Animal a : zoo) {
			a.move();
		}

	}

}
