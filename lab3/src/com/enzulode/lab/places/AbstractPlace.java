package com.enzulode.lab.places;

import com.enzulode.lab.entities.AbstractEntity;
import com.enzulode.lab.utils.PlacePrinter;
import com.enzulode.lab.utils.PrinterInterface;
import com.enzulode.lab.utils.ScriptInterface;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public abstract class AbstractPlace
{

	private String name;
	private List<AbstractEntity> entities;
	private List<AbstractPlace> subplaces;
	private ScriptInterface script;

	protected PrinterInterface printer;

	public AbstractPlace(String name)
	{
		this.name = name;
		entities = new LinkedList<>();
		subplaces = new LinkedList<>();
		printer = new PlacePrinter(this);
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void addEntity(AbstractEntity entity)
	{
		entities.add(entity);
	}

	public List<AbstractEntity> getEntities()
	{
		return entities;
	}

	public void addSubplace(AbstractPlace subplace)
	{
		subplaces.add(subplace);
	}

	public List<AbstractPlace> getSubplaces()
	{
		return subplaces;
	}

	public void removeEntity(AbstractEntity entity)
	{
		entities.remove(entity);
	}

	public void removeSubplace(AbstractPlace subplace)
	{
		subplaces.remove(subplace);
	}

	public void runScript()
	{
		if (script != null)
			printer.print();
	}

	public void addScript(ScriptInterface script)
	{
		this.script = script;
	}

	public ScriptInterface getScript()
	{
		return script;
	}

	public void removeScript()
	{
		script = null;
	}

	public abstract void runSubplacesScripts();
	public abstract void run();

	@Override
	public String toString()
	{
		return "Место: " + name;
	}

	@Override
	public int hashCode()
	{
		return Objects.hashCode(name)
				+ Objects.hashCode(entities)
				+ Objects.hashCode(subplaces)
				+ Objects.hashCode(script);
	}

	@Override
	public boolean equals(Object o)
	{
		if (o instanceof AbstractPlace ap)
			return hashCode() == ap.hashCode() && name.equals(ap.getName());

		return false;
	}

}
