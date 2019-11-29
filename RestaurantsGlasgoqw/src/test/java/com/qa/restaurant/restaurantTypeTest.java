package com.qa.restaurant;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class restaurantTypeTest {

	@Test
	public void faveFoodTest() {
		RestaurantType restaurant = new RestaurantType();
		String pasta = restaurant.setFaveFood("Pasta");
		String burgers = restaurant.setFaveFood("Burgers");
		String tacos = restaurant.setFaveFood("Tacos");
		String curry = restaurant.setFaveFood("Curry");
		String other = restaurant.setFaveFood("");

		Assert.assertEquals("Is your favourite restaurant Italian?", pasta);
		Assert.assertEquals("Is your favourite restaurant American?", burgers);
		Assert.assertEquals("Is your favourite restaurant Mexican?", tacos);
		Assert.assertEquals("Is your favourite restaurant Indian?", curry);
		Assert.assertEquals("There are no current recommendations for you, would you like to enter another food?", other);
		
	}

	@Test
	public void restRecTest() {
		RestaurantType restaurant = new RestaurantType();
		
		restaurant.setFaveFood("Pasta");
		String answer = restaurant.restRec("yes");
		Assert.assertEquals("www.websiteforpasta.com", answer);
		
		restaurant.setFaveFood("burgers");
		String answer2 = restaurant.restRec("yes");
		Assert.assertEquals("www.websiteforburgers.com", answer2);

		restaurant.setFaveFood("tacos");
		String answer3 = restaurant.restRec("yes");
		Assert.assertEquals("www.websitefortacos.com", answer3);

		restaurant.setFaveFood("curry");
		String answer4 = restaurant.restRec("yes");
		Assert.assertEquals("www.websiteforcurry.com", answer4);
		
		restaurant.setFaveFood("curry");
		String answer5 = restaurant.restRec("NO");
		Assert.assertEquals("Do you want to continue?", answer5);
	
		
	}

}
