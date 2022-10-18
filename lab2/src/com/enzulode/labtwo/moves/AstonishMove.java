package com.enzulode.labtwo.moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class AstonishMove extends PhysicalMove
{

	public AstonishMove()
	{
		super(Type.GHOST, 30, 100);
	}

	@Override
	protected void applyOppEffects(Pokemon pokemon)
	{
		if ((new Effect()).chance(0.3D).success())
			Effect.flinch(pokemon);

		super.applyOppEffects(pokemon);
	}

	@Override
	protected String describe()
	{
		return "uses Astonish";
	}
}
