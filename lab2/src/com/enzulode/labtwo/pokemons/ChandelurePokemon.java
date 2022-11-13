package com.enzulode.labtwo.pokemons;

import com.enzulode.labtwo.moves.ConfideMove;
import ru.ifmo.se.pokemon.Type;

public class ChandelurePokemon extends LampentPokemon
{

	public ChandelurePokemon(String name, int level)
	{
		super(name, level);
		setType(Type.GHOST, Type.FIRE);
		setStats(60, 55, 90, 145, 90, 80);

		addMove(new ConfideMove());
	}

}
