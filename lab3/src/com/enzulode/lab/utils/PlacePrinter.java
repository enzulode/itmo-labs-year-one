package com.enzulode.lab.utils;

import com.enzulode.lab.places.AbstractPlace;

public class PlacePrinter implements PrinterInterface
{

	private AbstractPlace place;

	public PlacePrinter(AbstractPlace place)
	{
		this.place = place;
	}

	@Override
	public void print()
	{
		System.out.println(preparePlaceDataString());
	}

	@Override
	public void debug()
	{
		System.out.println(preparePlaceDebugString());
	}

	private String preparePlaceDataString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(place.getScript().run());

		return sb.toString();
	}

	private String preparePlaceDebugString()
	{
		StringBuilder sb = new StringBuilder();

		sb.append("[DEBUG]").append("\n");
		sb.append("TITLE: ").append(place.getName()).append("\n");
		sb.append("ENTITIES: ").append(place.getEntities()).append("\n");
		sb.append("SUBPLACES").append(place.getSubplaces()).append("\n");

		return sb.toString();
	}
}
