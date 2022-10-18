package com.enzulode.labtwo;

import com.enzulode.labtwo.pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class LabTwo
{

	public static void main(String[] args)
	{

		Battle b = new Battle();
		b.addFoe(new MespritPokemon("Дядя Ваня", 1));
		b.addFoe(new ChandelurePokemon("Ебаная лампа", 1));
		b.addFoe(new SpritzeePokemon("Писюн", 1));

		b.addAlly(new SpritzeePokemon("Крокодилиус", 1));
		b.addAlly(new AromatissePokemon("Аромат нахуй", 1));
		b.addAlly(new LampentPokemon("Лампа поменьше", 1));

		b.go();

	}

}
