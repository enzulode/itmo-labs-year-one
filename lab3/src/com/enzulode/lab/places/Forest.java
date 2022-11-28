package com.enzulode.lab.places;

import java.util.Objects;

public class Forest extends AbstractPlace
{

	public Forest(String placeName)
	{
		super(placeName);
	}

	@Override
	public void runSubplacesScripts()
	{
		for (AbstractPlace subplace : getSubplaces())
			subplace.printer.print();
	}

	@Override
	public void run()
	{
		runSubplacesScripts();
		printer.print();
	}

	@Override
	public String toString()
	{
		return "Тип локации: лес, Название локации: " + getName();
	}

	@Override
	public int hashCode()
	{
		return Objects.hashCode(getName())
				+ Objects.hashCode(getEntities())
				+ Objects.hashCode(getSubplaces())
				+ Objects.hashCode(getScript());
	}

	@Override
	public boolean equals(Object o)
	{
		if (o instanceof Forest f)
			return hashCode() == f.hashCode() && (getName().equals(f.getName()));

		return false;
	}


}
