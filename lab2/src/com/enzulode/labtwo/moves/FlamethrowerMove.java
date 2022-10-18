package com.enzulode.labtwo.moves;

import ru.ifmo.se.pokemon.*;

public class FlamethrowerMove extends SpecialMove
{

	public FlamethrowerMove()
	{
		super(Type.FIRE, 90, 100);
	}

	@Override
	protected void applyOppEffects(Pokemon pokemon)
	{
		Effect effect = (new Effect()).chance(0.1D).condition(Status.BURN);

		pokemon.addEffect(effect);
		super.applyOppEffects(pokemon);
	}

	@Override
	protected String describe()
	{
		return "uses Flamethrower";
	}
}
