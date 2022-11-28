package com.enzulode.lab.places;

import com.enzulode.lab.entities.EntityInterface;
import com.enzulode.lab.utils.ScriptInterface;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public abstract class AbstractPlace
{

	private String placeName;
	private List<EntityInterface> entities;
	private List<AbstractPlace> subplaces;
	private ScriptInterface script;


	{
		placeName = "AbstractPlaceName";
		entities = new LinkedList<>();
		subplaces = new LinkedList<>();
	}
	public AbstractPlace(String placeName)
	{
		this.placeName = placeName;
	}

	public void setPlaceName(String placeName)
	{
		this.placeName = placeName;
	}

	public String getPlaceName()
	{
		return placeName;
	}

	public void addEntity(EntityInterface entity)
	{
		entities.add(entity);
	}

	public void addSubplace(AbstractPlace subplace)
	{
		subplaces.add(subplace);
	}

	public void removeEntity(EntityInterface entity)
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
			script.run();
	}

	public void runSubplacesScripts()
	{
		for (AbstractPlace subplace : subplaces)
			subplace.runScript();
	}

	public void addScript(ScriptInterface script)
	{
		this.script = script;
	}

	public void removeScript()
	{
		script = null;
	}

	public abstract void run();

	@Override
	public String toString()
	{
		return "Место: " + placeName;
	}

	@Override
	public int hashCode()
	{
		return (Objects.hashCode(this) | 47) + 5;
	}

	@Override
	public boolean equals(Object o)
	{
		if (o instanceof AbstractPlace ap)
		{
			return hashCode() == ap.hashCode()
					&& placeName.equals(ap.placeName)
					&& (entities.size() == ap.entities.size())
					&& (subplaces.size() == ap.subplaces.size());
		}

		return false;
	}

}
