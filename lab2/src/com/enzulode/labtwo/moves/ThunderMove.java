package com.enzulode.labtwo.moves;

import ru.ifmo.se.pokemon.*;

public class ThunderMove extends SpecialMove
{

	public ThunderMove()
	{
		super(Type.ELECTRIC, 110, 70);
	}

	@Override
	protected void applyOppEffects(Pokemon pokemon)
	{
		Effect effect = (new Effect()).chance(0.3D).condition(Status.PARALYZE);

		pokemon.addEffect(effect);
		super.applyOppEffects(pokemon);
	}

	@Override
	protected String describe()
	{
		return "uses Thunder";
	}
}
