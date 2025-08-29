package com.abhinavgpt;

import com.abhinavgpt.immutable.Person;
import com.abhinavgpt.immutable.PersonRecord;
import com.abhinavgpt.singleton.SingletonPattern;

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
	}
}
