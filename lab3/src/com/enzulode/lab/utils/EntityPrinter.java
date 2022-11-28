package com.enzulode.lab.utils;

import com.enzulode.lab.entities.AbstractEntity;

public class EntityPrinter implements PrinterInterface
{

	private AbstractEntity entity;

	public EntityPrinter(AbstractEntity entity)
	{
		this.entity = entity;
	}

	@Override
	public void print()
	{
		System.out.println(prepareEntityDataString());
	}

	@Override
	public void debug()
	{
		System.out.println(prepareEntityDebugString());
	}

	private String prepareEntityDataString()
	{
		StringBuilder sb = new StringBuilder();
		for (String action : entity.getActions())
			sb.append(action).append("\n");

		return sb.toString();
	}

	private String prepareEntityDebugString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(entity).append("\n");
		sb.append("[DEBUG] ACTIONS: ");
		for (String action : entity.getActions())
			sb.append(action).append("\n");

		return sb.toString();
	}

}
