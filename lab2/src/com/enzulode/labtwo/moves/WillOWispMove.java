package com.enzulode.labtwo.moves;

import ru.ifmo.se.pokemon.*;

public class WillOWispMove extends StatusMove
{

	public WillOWispMove()
	{
		super(Type.FIRE, 0, 85);
	}

	@Override
	protected void applyOppEffects(Pokemon pokemon)
	{
		int hp = (int)pokemon.getStat(Stat.HP);
		int recalculatedHp = (int) (hp - Math.round(hp/8.0));
		int recalculatedAttack = (int) (pokemon.getStat(Stat.ATTACK) / 2.0);

		Effect effect = (new Effect()).condition(Status.BURN).stat(Stat.HP, recalculatedHp).stat(Stat.ATTACK, recalculatedAttack);

		pokemon.addEffect(effect);
		super.applyOppEffects(pokemon);
	}

	@Override
	protected String describe()
	{
		return "uses Will-O-Wisp";
	}
}
