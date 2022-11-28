package com.enzulode.lab.utils;

import com.enzulode.lab.effects.SideEffects;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class EffectScript implements ScriptInterface
{

	private final List<String> actions;

	{
		actions = new LinkedList<>();
	}

	@Override
	public ScriptInterface addAction(String action)
	{
		actions.add(action);
		return this;
	}

	public ScriptInterface addEffect(SideEffects... effects)
	{

		if (effects.length == 0)
			return this;

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < effects.length; i++)
		{
			sb.append(effects[i]);
			if (i != effects.length-1)
				sb.append(", ");
		}
		sb.append(".");
		actions.add(sb.toString());
		return this;
	}

	@Override
	public String run()
	{
		StringBuilder sb = new StringBuilder();
		for (String action : actions)
			sb.append(action).append("\n");

		return sb.toString();
	}

	@Override
	public String toString()
	{
		return "Сценарий для тропинки: " + actions.toString();
	}

	@Override
	public int hashCode()
	{
		return (Objects.hashCode(this) | 82) + 14;
	}

	@Override
	public boolean equals(Object o)
	{
		if (o instanceof EffectScript es)
			return actions.size() == es.actions.size() && hashCode() == es.hashCode();

		return false;
	}
}
