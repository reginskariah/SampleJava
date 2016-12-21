package com.csrk.apps;

import com.csrk.beings.Animal;
import com.csrk.beings.Dog;

public class AnimalApp {

	public static void main(String[] args) {
		Animal aAnimal = new Animal();
		Dog aDog = new Dog();
		
		aAnimal.says();
		aDog.says();

	}

}
