package com.enzulode.labtwo.pokemons;

import com.enzulode.labtwo.moves.AstonishMove;
import com.enzulode.labtwo.moves.ConfideMove;
import com.enzulode.labtwo.moves.FlamethrowerMove;
import com.enzulode.labtwo.moves.WillOWispMove;
import ru.ifmo.se.pokemon.Type;

public class ChandelurePokemon extends LampentPokemon
{

	public ChandelurePokemon(String name, int level)
	{
		super(name, level);
		setType(Type.GHOST, Type.FIRE);
		setStats(60, 55, 90, 145, 90, 80);

		addMove(new WillOWispMove());
		addMove(new FlamethrowerMove());
		addMove(new AstonishMove());
		addMove(new ConfideMove());
	}

}
