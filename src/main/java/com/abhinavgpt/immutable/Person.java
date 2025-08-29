package com.abhinavgpt.immutable;

public final class Person
{
	private final String name;
	private final int age;
	private final int height;
	private final int weight;

	private Person(Builder builder)
	{
		this.name = builder.name;
		this.age = builder.age;
		this.height = builder.height;
		this.weight = builder.weight;
	}

	public static Builder newBuilder()
	{
		return new Builder();
	}

	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}

	public int getHeight()
	{
		return height;
	}

	public int getWeight()
	{
		return weight;
	}

	@Override
	public String toString()
	{
		return "Person{" + "name='" + name + '\'' + ", age=" + age + ", height=" + height + ", weight=" + weight + '}';
	}

	// Inner Builder class
	public static final class Builder
	{
		private String name;
		private int age;
		private int height;
		private int weight;

		// Fluent methods (prefix with "with" for clarity)
		public Builder withName(String name)
		{
			this.name = name;
			return this;
		}

		public Builder withAge(int age)
		{
			this.age = age;
			return this;
		}

		public Builder withHeight(int height)
		{
			this.height = height;
			return this;
		}

		public Builder withWeight(int weight)
		{
			this.weight = weight;
			return this;
		}

		// Final build method
		public Person build()
		{
			return new Person(this);
		}
	}
}