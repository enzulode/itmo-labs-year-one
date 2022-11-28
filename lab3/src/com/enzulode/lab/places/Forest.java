package com.enzulode.lab.places;

import java.util.Objects;

public class Forest extends AbstractPlace
{

	public Forest(String placeName)
	{
		super(placeName);
	}

	@Override
	public void run()
	{
		runSubplacesScripts();
		runScript();
	}

	@Override
	public String toString()
	{
		return "Тип локации: лес, Название локации: " + getPlaceName();
	}

	@Override
	public int hashCode()
	{
		return (Objects.hashCode(this) | 82) + 7;
	}

	@Override
	public boolean equals(Object o)
	{
		if (o instanceof Forest forest)
			return hashCode() == forest.hashCode() && (getPlaceName().equals(forest.getPlaceName()));

		return false;
	}


}
