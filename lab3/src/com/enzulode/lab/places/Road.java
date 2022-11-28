package com.enzulode.lab.places;

import java.util.Objects;

public class Road extends AbstractPlace
{
	public Road(String name)
	{
		super(name);
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
		return "Тип локации: лесная тропинка, Название локации: " + getName();
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
		if (o instanceof Road r)
			return hashCode() == r.hashCode() && (getName().equals(r.getName()));

		return false;
	}
}
