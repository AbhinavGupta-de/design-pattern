package com.abhinavgpt.strategy;

public enum StoneType
{
	SMALL
			{
				@Override
				public Stone createStone()
				{
					return new Small("smallboi");
				}
			}, MEDIUM
		{
			@Override
			public Stone createStone()
			{
				return new Medium("mediumboi");
			}
		}, LARGE
		{
			@Override
			public Stone createStone()
			{
				return new Large("largeboi");
			}
		};

	public abstract Stone createStone();
}