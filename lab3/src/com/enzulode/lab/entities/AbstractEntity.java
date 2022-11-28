package com.enzulode.lab.entities;

import com.enzulode.lab.utils.EntityPrinter;
import com.enzulode.lab.utils.PrinterInterface;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public abstract class AbstractEntity
{

	private String nickname;
	protected List<String> actions;
	private PrinterInterface printer;

	public AbstractEntity(String nickname)
	{
		this.nickname = nickname;
		actions = new LinkedList<>();
		printer = new EntityPrinter(this);
	}

	public String getNickname()
	{
		return nickname;
	}

	public void setNickname(String nickname)
	{
		this.nickname = nickname;
	}

	public List<String> getActions()
	{
		return actions;
	}

	public void performActions()
	{
		printer.print();
	}

	public void debug()
	{
		printer.debug();
	}

	public abstract void addAction(String action);

	@Override
	public String toString()
	{
		return "Сущность: " + nickname + " имеет actions: " + actions;
	}

	@Override
	public int hashCode()
	{
		return Objects.hashCode(nickname) + Objects.hashCode(actions);
	}

	@Override
	public boolean equals(Object o)
	{
		if (o instanceof AbstractEntity ae)
			return (hashCode() == ae.hashCode() && nickname.equals(ae.nickname));

		return false;
	}

}
