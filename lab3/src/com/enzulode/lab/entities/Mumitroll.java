package com.enzulode.lab.entities;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Mumitroll implements EntityInterface
{
	private String nickname;
	private List<String> actions;

	{
		nickname = "NONAME";
		actions = new LinkedList<>();
	}

	public Mumitroll(String nickname)
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
		return "Муми-тролль: nickname - " + nickname;
	}

	@Override
	public int hashCode()
	{
		return (Objects.hashCode(this) | 54) + 2;
	}

	@Override
	public boolean equals(Object o)
	{
		if (o instanceof Mumitroll mt)
			return nickname.equals(mt.getNickname()) && (actions.size() == mt.actions.size());

		return false;
	}
}
