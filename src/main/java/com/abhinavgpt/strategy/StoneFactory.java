package com.abhinavgpt.strategy;

public class StoneFactory
{
	private StoneGenerationStrategy strategy;

	public StoneFactory(StoneGenerationStrategy strategy)
	{
		this.strategy = strategy;
	}

	public void setStrategy(StoneGenerationStrategy strategy)
	{
		this.strategy = strategy;
	}

	public Stone createStone()
	{
		if (strategy == null)
		{
			throw new IllegalStateException("No strategy set for StoneFactory!");
		}
		return strategy.createStone();
	}
}