package com.abhinavgpt.singleton;

public class SingletonPattern
{
	private SingletonPattern()
	{
	}

	private static class SingletonHelper
	{
		private static final SingletonPattern INSTANCE = new SingletonPattern();
	}

	public static SingletonPattern getInstance()
	{
		return SingletonHelper.INSTANCE;
	}
}
