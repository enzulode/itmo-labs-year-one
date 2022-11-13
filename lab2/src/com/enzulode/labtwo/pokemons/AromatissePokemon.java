package com.enzulode.labtwo.pokemons;

import com.enzulode.labtwo.moves.ThunderMove;
import ru.ifmo.se.pokemon.Type;

public class AromatissePokemon extends SpritzeePokemon
{

	public AromatissePokemon(String name, int level)
	{
		super(name, level);
		setType(Type.FAIRY);
		setStats(101, 72, 72, 99, 89, 29);

		addMove(new ThunderMove());
	}

}
