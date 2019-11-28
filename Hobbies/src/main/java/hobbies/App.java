package hobbies;

import java.util.Arrays;
import java.util.LinkedList;

public class App 
{
	public static void main(String[] args) {
		String[] mattHobbies = {"Kayaking", "Traveling", "Pubs", "Gym"};
		String[] jamesHobbies = {"Magic"};
		String[] lizHobbies = {"Jogging", "Baking", "Swimming", "Flute", "Gym"};
		String[] tigsHobbies = {"dance","running","gym","baking","cooking"};
		String[] jonHobbies = {"football", "podcasting", "youtubing", "sopranos", "marvel"};
		String[] anthonyHobbies = {"Football", "Podcasts", "Climbing", "YouTube", "Gym"};
		String[][] allHobbies = { mattHobbies, jamesHobbies,  lizHobbies,  tigsHobbies, jonHobbies, anthonyHobbies};
		
		LinkedList<String> linkHobbies = new LinkedList<String>();
		linkHobbies.addAll(Arrays.asList(mattHobbies));
		linkHobbies.addAll(Arrays.asList(jamesHobbies));
		linkHobbies.addAll(Arrays.asList(lizHobbies));				
		linkHobbies.addAll(Arrays.asList(tigsHobbies));
		linkHobbies.addAll(Arrays.asList(jonHobbies));
		linkHobbies.addAll(Arrays.asList(anthonyHobbies));
		System.out.println(linkHobbies);
	
		// or
		
		LinkedList<String> mattLinkHobbies = new LinkedList<String>();
		mattLinkHobbies.add("Kayaking");
		mattLinkHobbies.add("Traveling");
		mattLinkHobbies.add("Pubs");
		mattLinkHobbies.add("Gym");
		System.out.println(mattLinkHobbies);
		
		for (String i[] : allHobbies) {
			for(String j : i) {
				System.out.println(j);
			}
		}
	}
}
