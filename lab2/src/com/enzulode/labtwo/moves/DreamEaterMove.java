package com.enzulode.labtwo.moves;

import ru.ifmo.se.pokemon.*;

public class DreamEaterMove extends SpecialMove
{

	public DreamEaterMove()
	{
		super(Type.PSYCHIC, 100, 100);
	}

	@Override
	protected void applySelfDamage(Pokemon pokemon, double v)
	{
		pokemon.setMod(Stat.HP, (int)(Math.round(v/2.0)));
	}

	@Override
	protected void applyOppDamage(Pokemon pokemon, double v)
	{
		if (pokemon.getCondition() == Status.SLEEP)
			super.applyOppDamage(pokemon, v);
	}

	@Override
	protected String describe()
	{
		return "uses DreamEater";
	}
}
