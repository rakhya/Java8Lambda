package com.rakhya.gsu.java8lambda;

import java.util.Arrays;
import java.util.List;

public class Java8SortAnimals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Animal> animals = Arrays.asList(
				new Animal("Lion","carn",200),
				new Animal("Tiger","carn",180),
				new Animal("Deer","herb",100),
				new Animal("Zebra","herb",150),
				new Animal("Man","omni",80)
				);
		print(animals);
		System.out.println("-----------------------------------");
		animals.sort((a1,a2) -> a1.getName().compareTo(a2.getName()));
		print(animals);
		System.out.println("-----------------------------------");
		animals.sort((a1,a2) -> a1.getType().compareTo(a2.getType()));
		print(animals);
		System.out.println("-----------------------------------");
		animals.sort((a1,a2) -> new Integer(a1.getWeight()).compareTo(a2.getWeight()));
		print(animals);
	}

	public static void print(List<Animal> animals) {
		for(Animal a: animals) {
			System.out.println(a);
		}
	}
}
