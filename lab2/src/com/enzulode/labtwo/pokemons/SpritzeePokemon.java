package com.enzulode.labtwo.pokemons;

import com.enzulode.labtwo.moves.DreamEaterMove;
import com.enzulode.labtwo.moves.PsychicMove;
import com.enzulode.labtwo.moves.RestMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class SpritzeePokemon extends Pokemon
{

	public SpritzeePokemon(String name, int level)
	{
		super(name, level);
		setType(Type.FAIRY);
		setStats(78, 52, 60, 63, 65, 23);

		addMove(new DreamEaterMove());
		addMove(new RestMove());
		addMove(new PsychicMove());
	}

}
