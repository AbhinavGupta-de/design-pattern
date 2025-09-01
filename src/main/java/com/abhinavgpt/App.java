package com.abhinavgpt;

import com.abhinavgpt.immutable.Person;
import com.abhinavgpt.immutable.PersonRecord;
import com.abhinavgpt.singleton.SingletonPattern;
import com.abhinavgpt.strategy.BalancedStoneStrategy;
import com.abhinavgpt.strategy.RandomStoneStrategy;
import com.abhinavgpt.strategy.StoneFactory;

/**
 * Hello world!
 *
 */
public class App
{
	public static void main(String[] args)
	{
		SingletonPattern singletonPattern = SingletonPattern.getInstance();

		Person person = Person.newBuilder().withName("Abhin").withAge(22).withHeight(12).build();
		System.out.println(person);

		PersonRecord newPerson = new PersonRecord("Abhin", 22, 12, 12);
		System.out.println(newPerson);

		System.out.println("Hello World!");

		StoneFactory factory = new StoneFactory(new RandomStoneStrategy());

		System.out.println("Random Strategy:");
		for (int i = 0; i < 5; i++)
		{
			System.out.println(factory.createStone().getName());
		}

		// Switch to Balanced Strategy
		factory.setStrategy(new BalancedStoneStrategy());

		System.out.println("\nBalanced Strategy:");
		for (int i = 0; i < 9; i++)
		{
			System.out.println(factory.createStone().getName());
		}
	}
}
