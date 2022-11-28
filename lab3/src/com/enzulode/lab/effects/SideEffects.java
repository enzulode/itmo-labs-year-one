package com.enzulode.lab.effects;

public enum SideEffects
{
	STEPS("С обеих сторон тропинки слышались шорохи и шелест крадущихся шагов"),
	SPOOKINESS("веяло жутью"),
	EYES("Временами из-за стволов деревьев выглядывали маленькие светящиеся глаза"),
	CALLED("временами кто-то окликал их с земли или древесных кущ");


	private final String message;

	SideEffects(String message)
	{
		this.message = message;
	}

	@Override
	public String toString()
	{
		return message;
	}

}
