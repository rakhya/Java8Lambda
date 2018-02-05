package com.rakhya.gsu.java8lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Java7SortAnimals {
	
	public static void main(String[] args) {
	List<Animal> animals = Arrays.asList(
			new Animal("Lion","carn",200),
			new Animal("Tiger","carn",180),
			new Animal("Deer","herb",100),
			new Animal("Zebra","herb",150),
			new Animal("Man","omni",80)
			);
	
	printAnimals(animals);
	
	Collections.sort(animals, new Comparator<Animal>() {

		@Override
		public int compare(Animal a1, Animal a2) {
			// TODO Auto-generated method stub
			return a1.getName().compareTo(a2.getName());
		}
	});
	
	System.out.println("-----------------------------------");
	
	printAnimals(animals);
	}
	
	public static void printAnimals(List<Animal> animals) {
		for(Animal a: animals) {
			System.out.println(a);
		}
	}
}
