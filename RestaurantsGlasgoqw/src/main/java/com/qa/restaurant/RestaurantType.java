package com.qa.restaurant;

public class RestaurantType {

	String faveFood;
	String question;

	public String setFaveFood(String food) {
		
		boolean isPasta = "Pasta".equalsIgnoreCase(food);
		boolean isBurgers = "Burgers".equalsIgnoreCase(food);
		boolean isTacos = "Tacos".equalsIgnoreCase(food);
		boolean isCurry = "Curry".equalsIgnoreCase(food);

		if (isPasta) {
			faveFood = food;
			question = "Is your favourite restaurant Italian?";
			return question;
		}

		if (isBurgers) {
			faveFood = food;
			question = "Is your favourite restaurant American?";
			return question;
		}

		if (isTacos) {
			faveFood = food;
			question = "Is your favourite restaurant Mexican?";
			return question;
		}

		if (isCurry) {
			faveFood = food;
			question = "Is your favourite restaurant Indian?";
			return question;
		}

		question = "There are no current recommendations for you, would you like to enter another food?";
		//OUTPUT Q
		//INPUT ANS
		//CALL NEXT FUNCTION (RESTREC(ANS))
		return question;

	}

	public String restRec(String answer) {
		
		if (answer.equalsIgnoreCase("yes")) {
			String links;
			if (faveFood.equalsIgnoreCase("pasta")) {
				links = "www.websiteforpasta.com";
				return links;
			}
			if (faveFood.equalsIgnoreCase("burgers")) {
				links = "www.websiteforburgers.com";
				return links;
			}
			if (faveFood.equalsIgnoreCase("tacos")) {
				links = "www.websitefortacos.com";
				return links;
			}
			if (faveFood.equalsIgnoreCase("curry")) {
				links = "https://www.tripadvisor.co.uk/Restaurant_Review-g186534-d1509107-Reviews-Koolba-Glasgow_Scotland.html";
				return links;
			}

		} else if (answer.equalsIgnoreCase("no")) {
			return "Do you want to continue?";
		}
		return "Please input that again.";
	}

}
