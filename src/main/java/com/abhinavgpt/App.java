package com.abhinavgpt;

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
		System.out.println("Hello World!");
	}
}
