package com.enzulode.lab.entities;

import java.util.Objects;

public class Snusmumric extends AbstractEntity
{
	public Snusmumric(String nickname)
	{
		super(nickname);
	}

	@Override
	public void addAction(String action)
	{
		actions.add(action);
	}

	@Override
	public int hashCode()
	{
		return Objects.hashCode(getActions()) + Objects.hashCode(getNickname());
	}

	@Override
	public boolean equals(Object o)
	{
		if (o instanceof Snusmumric sm)
			return hashCode() == sm.hashCode() && getNickname().equals(sm.getNickname());

		return false;
	}
}
