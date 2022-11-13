package com.enzulode.labtwo.pokemons;

import com.enzulode.labtwo.moves.AstonishMove;

public class LampentPokemon extends LitwickPokemon
{

	public LampentPokemon(String name, int level)
	{
		super(name, level);
		setStats(60, 40, 60, 95, 60, 55);

		addMove(new AstonishMove());
	}

}
