package com.enzulode.labtwo.moves;

import ru.ifmo.se.pokemon.*;

public class PsychicMove extends SpecialMove
{

	public PsychicMove()
	{
		super(Type.PSYCHIC, 90, 100);
	}

	@Override
	protected void applyOppEffects(Pokemon pokemon)
	{
		Effect effect = (new Effect()).chance(0.1D).stat(Stat.SPECIAL_DEFENSE, -1);

		pokemon.addEffect(effect);
		super.applyOppEffects(pokemon);
	}

	@Override
	protected String describe()
	{
		return "uses Psychic";
	}
}
