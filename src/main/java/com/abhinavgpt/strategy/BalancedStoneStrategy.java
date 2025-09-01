package com.abhinavgpt.strategy;

import java.util.concurrent.atomic.AtomicInteger;

public class BalancedStoneStrategy implements StoneGenerationStrategy
{
	private final StoneType[] stoneTypes = StoneType.values();
	private final AtomicInteger counter = new AtomicInteger(0);

	@Override
	public Stone createStone()
	{
		int index = counter.getAndIncrement() % stoneTypes.length;
		return stoneTypes[index].createStone();
	}
}
