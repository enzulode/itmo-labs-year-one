package com.enzulode.labtwo.moves;

import ru.ifmo.se.pokemon.*;

public class RestMove extends StatusMove
{

	public RestMove()
	{
		super(Type.PSYCHIC, 0, 0);
	}

	@Override
	protected void applySelfEffects(Pokemon pokemon)
	{
		Effect effect = (new Effect()).condition(Status.SLEEP).turns(2);

		pokemon.addEffect(effect);
		super.applySelfEffects(pokemon);
	}

	@Override
	protected String describe()
	{
		return "uses Rest";
	}
}
