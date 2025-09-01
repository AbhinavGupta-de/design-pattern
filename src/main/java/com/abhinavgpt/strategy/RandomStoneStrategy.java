package com.abhinavgpt.strategy;

import java.util.Random;

public class RandomStoneStrategy implements StoneGenerationStrategy
{
	private final StoneType[] stoneTypes = StoneType.values();
	private final Random random = new Random();

	@Override
	public Stone createStone()
	{
		int index = random.nextInt(stoneTypes.length);
		return stoneTypes[index].createStone();
	}
}