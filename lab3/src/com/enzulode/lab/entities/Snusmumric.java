package com.enzulode.lab.entities;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Snusmumric implements EntityInterface
{

	private String nickname;
	private List<String> actions;

	{
		nickname = "NONAME";
		actions = new LinkedList<>();
	}
	public Snusmumric(String nickname)
	{
		this.nickname = nickname;
	}

	public String getNickname()
	{
		return nickname;
	}

	public void setNickname(String nickname)
	{
		this.nickname = nickname;
	}

	@Override
	public void performActions()
	{
		for (String action : actions)
			System.out.println(action);
	}

	@Override
	public void addAction(String action)
	{
		actions.add(action);
	}

	@Override
	public String toString()
	{
		return "Снусмумрик: nickname - " + nickname;
	}

	@Override
	public int hashCode()
	{
		return (Objects.hashCode(this) | 77) + 1;
	}

	@Override
	public boolean equals(Object o)
	{
		if (o instanceof Snusmumric sm)
			return nickname.equals(sm.getNickname()) && (actions.size() == sm.actions.size());

		return false;
	}
}
