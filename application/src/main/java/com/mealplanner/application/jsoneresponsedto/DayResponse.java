package com.mealplanner.application.jsoneresponsedto;

import java.util.List;

import com.mealplanner.application.mealdto.Meal;
import com.mealplanner.application.mealdto.NutritionalContent;


	//DayResponse maps the JSON parsed string to an object when sending a query for a 
//		single day of meals to the spoonacular API
public class DayResponse {
	List<Meal> meals;
	
	NutritionalContent nutrients;

	public List<Meal> getMeals() {
		return meals;
	}

	public void setMeals(List<Meal> meals) {
		this.meals = meals;
	}

	public NutritionalContent getNutrients() {
		return nutrients;
	}

	public void setNutrients(NutritionalContent nutrients) {
		this.nutrients = nutrients;
	}
	
	
}
