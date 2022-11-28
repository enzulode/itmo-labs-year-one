package com.enzulode.lab;

import com.enzulode.lab.effects.SideEffects;
import com.enzulode.lab.entities.AbstractEntity;
import com.enzulode.lab.entities.Mumitroll;
import com.enzulode.lab.entities.Snusmumric;
import com.enzulode.lab.places.AbstractPlace;
import com.enzulode.lab.places.Forest;
import com.enzulode.lab.places.Road;
import com.enzulode.lab.utils.EffectScript;
import com.enzulode.lab.utils.ScriptInterface;

public class Lab3
{

	/*

	Снусмумрик сокрушенно покачал головой. Идя лесом, Муми-тролль все теснее жался к Снусмумрику.
	С обеих сторон тропинки слышались шорохи и шелест крадущихся шагов, веяло жутью.
	Временами из-за стволов деревьев выглядывали маленькие светящиеся глаза, временами кто-то окликал их
	с земли или из древесных кущ.

	 */
	
	public Lab3()
	{
		AbstractPlace forest = new Forest("Дом лешего");
		AbstractPlace road = new Road("Скользкая дорожка");

		AbstractEntity snusmumric = new Snusmumric("Обалдуй");
		snusmumric.addAction("Снусмумрик сокрушённо покачал головой.");
		AbstractEntity mumitroll = new Mumitroll("Попуск");
		mumitroll.addAction("Идя лесом, Муми-тролль всё теснее жался к Снусмумрику.");

		snusmumric.performActions();
		mumitroll.performActions();

		forest.addEntity(snusmumric);
		forest.addEntity(mumitroll);

		ScriptInterface roadEffectsScript = (new EffectScript()).addEffect(SideEffects.STEPS, SideEffects.SPOOKINESS);
		ScriptInterface forestEffectsScript = (new EffectScript()).addEffect(SideEffects.EYES, SideEffects.CALLED);

		road.addScript(roadEffectsScript);
		forest.addScript(forestEffectsScript);
		forest.addSubplace(road);
		forest.run();
	}


	public static void main(String[] args)
	{
		Lab3 lab3 = new Lab3();
	}

}
