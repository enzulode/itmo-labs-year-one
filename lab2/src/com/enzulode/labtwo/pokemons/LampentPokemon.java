package com.enzulode.labtwo.pokemons;

import com.enzulode.labtwo.moves.AstonishMove;
import com.enzulode.labtwo.moves.FlamethrowerMove;
import com.enzulode.labtwo.moves.WillOWispMove;

public class LampentPokemon extends LitwickPokemon
{

	public LampentPokemon(String name, int level)
	{
		super(name, level);
		setStats(60, 40, 60, 95, 60, 55);

		addMove(new WillOWispMove());
		addMove(new FlamethrowerMove());
		addMove(new AstonishMove());
	}

}
