package com.abhinavgpt.strategy;

public class Large implements Stone
{
	private final String name;

	public Large(final String name)
	{
		this.name = name;
	}

	@Override
	public String getName()
	{
		return name;
	}
}
