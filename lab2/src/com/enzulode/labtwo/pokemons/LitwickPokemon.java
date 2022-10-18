package com.enzulode.labtwo.pokemons;

import com.enzulode.labtwo.moves.FlamethrowerMove;
import com.enzulode.labtwo.moves.WillOWispMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class LitwickPokemon extends Pokemon
{

	public LitwickPokemon(String name, int level)
	{
		super(name, level);
		setType(Type.GHOST, Type.FIRE);
		setStats(50, 30, 55, 65, 55, 20);

		addMove(new WillOWispMove());
		addMove(new FlamethrowerMove());
	}

}
