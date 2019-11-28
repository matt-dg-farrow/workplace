package utils;

import java.util.List;

import entities.Person;

import java.util.ArrayList;
import java.util.Arrays;

public class PersonManager {
	List<Person> people = new ArrayList<>();
	
	public PersonManager(Person... p) {
		people.addAll(Arrays.asList(p));
	}
	
	public Person search(String name) {
		for(Person i : people) {
			if(i.getName().equals(name)) {
				return i;
			}
		}
		
		return null;
	}
}
