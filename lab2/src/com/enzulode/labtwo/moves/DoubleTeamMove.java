package com.enzulode.labtwo.moves;

import ru.ifmo.se.pokemon.*;

public class DoubleTeamMove extends StatusMove
{

	public DoubleTeamMove()
	{
		super(Type.NORMAL, 0, 0);
	}

	@Override
	protected void applySelfEffects(Pokemon pokemon)
	{
		Effect effect = (new Effect()).stat(Stat.EVASION, 1);

		pokemon.addEffect(effect);
		super.applySelfEffects(pokemon);
	}

	@Override
	protected String describe()
	{
		return "uses DoubleTeam";
	}
}
