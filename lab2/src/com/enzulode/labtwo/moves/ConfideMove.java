package com.enzulode.labtwo.moves;

import ru.ifmo.se.pokemon.*;

public class ConfideMove extends StatusMove
{

	public ConfideMove()
	{
		super(Type.NORMAL, 0, 0);
	}

	@Override
	protected void applyOppEffects(Pokemon pokemon)
	{
		int specialAttackDefault = (int) pokemon.getStat(Stat.SPECIAL_ATTACK);
		Effect effect = (new Effect()).stat(Stat.SPECIAL_ATTACK, specialAttackDefault-1);

		pokemon.addEffect(effect);
		super.applyOppEffects(pokemon);
	}

	@Override
	protected String describe()
	{
		return "uses Confide";
	}
}
