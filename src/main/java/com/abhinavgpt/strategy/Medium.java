package com.abhinavgpt.strategy;

public class Medium implements Stone
{

	private final String name;

	public Medium(String name)
	{
		this.name = name;
	}

	@Override
	public String getName()
	{
		return name;
	}
}
