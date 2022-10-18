package com.enzulode.labtwo.pokemons;

import com.enzulode.labtwo.moves.CharmMove;
import com.enzulode.labtwo.moves.DoubleTeamMove;
import com.enzulode.labtwo.moves.ExtrasensoryMove;
import com.enzulode.labtwo.moves.ThunderMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class MespritPokemon extends Pokemon
{

	public MespritPokemon(String name, int level)
	{
		super(name, level);
		setType(Type.PSYCHIC);
		setStats(80, 105, 105, 105, 105, 80);

		addMove(new ExtrasensoryMove());
		addMove(new ThunderMove());
		addMove(new DoubleTeamMove());
		addMove(new CharmMove());
	}



}
