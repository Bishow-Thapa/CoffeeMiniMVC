package com.coffee.model;

import java.util.*;

public class CoffeeExpert 
{
	public List getCoffee(String coffee)
	{
		List myCoffee = new ArrayList();
		if(coffee.equals("black"))
		{
			myCoffee.add("two shots of espresso");
			myCoffee.add("Taste quite stong");
		}
		else 
		{
			myCoffee.add("Foamed Milk");
			myCoffee.add("Chocolate Cream");
		}
		
		return (myCoffee);
	}
}
