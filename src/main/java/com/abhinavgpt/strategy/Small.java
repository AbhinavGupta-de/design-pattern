package com.abhinavgpt.strategy;

public class Small implements Stone
{
	private final String name;

	public Small(String name)
	{
		this.name = name;
	}

	@Override
	public String getName()
	{
		return name;
	}
}
