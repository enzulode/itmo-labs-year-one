package com.enzulode.labtwo.moves;

import ru.ifmo.se.pokemon.*;

public class ExtrasensoryMove extends SpecialMove
{

	public ExtrasensoryMove()
	{
		super(Type.PSYCHIC, 80, 100);
	}

	@Override
	protected void applyOppEffects(Pokemon pokemon)
	{
		if ((new Effect()).chance(0.1D).success())
			Effect.flinch(pokemon);

		super.applyOppEffects(pokemon);
	}

	@Override
	protected String describe()
	{
		return "uses Extrasensory";
	}
}
