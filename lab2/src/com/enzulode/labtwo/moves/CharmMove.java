package com.enzulode.labtwo.moves;

import ru.ifmo.se.pokemon.*;

public class CharmMove extends StatusMove
{

	public CharmMove()
	{
		super(Type.FAIRY, 0, 100);
	}

	@Override
	protected void applyOppEffects(Pokemon pokemon)
	{
		Effect effect = (new Effect()).stat(Stat.ATTACK, -2);

		pokemon.addEffect(effect);
		super.applyOppEffects(pokemon);
	}

	@Override
	protected String describe()
	{
		return "uses Charm";
	}
}
