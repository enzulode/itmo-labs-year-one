package com.enzulode.labtwo;

import com.enzulode.labtwo.pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class LabTwo
{
	public static void main(String[] args)
	{
		(new LabTwo()).run();
	}

	private void run()
	{
		Battle b = new Battle();
		b.addFoe(new MespritPokemon("Один", 1));
		b.addFoe(new ChandelurePokemon("Два", 1));
		b.addFoe(new SpritzeePokemon("Три", 1));

		b.addAlly(new SpritzeePokemon("Четыре", 1));
		b.addAlly(new AromatissePokemon("Пять", 1));
		b.addAlly(new LampentPokemon("Шесть", 1));

		b.go();
	}

}
