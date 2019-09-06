package ru.demidovnn;

public class EffectCard extends Card implements IEffect{

	public EffectCard(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void damage(Person p) {
		// TODO Auto-generated method stub
		p.getDamage(2);
	}

	@Override
	public void damage(BeastCard c) {
		// TODO Auto-generated method stub
		c.getDamage(2);
	}

	@Override
	public void heal(Person p) {
		// TODO Auto-generated method stub
		if( p.getHealth() + 3 > p.getMaxHealth()) 
			p.setHealth(p.getMaxHealth());
		else
			p.setHealth(p.getHealth() + 3);
	}

	@Override
	public void heal(BeastCard c) {
		// TODO Auto-generated method stub
		if( c.health + 2 > c.getMaxHealth()) 
			c.health = c.getMaxHealth();
		else
			c.setHealth(c.health + 2);
	}

	@Override
	public void addStrength(Person p) {
		// TODO Auto-generated method stub
		p.setStrength(p.getStrength() + 2);
	}

	@Override
	public void addStrength(BeastCard c) {
		// TODO Auto-generated method stub
		c.setStrength(c.getStrength() + 1);
	}

	@Override
	public void addMana(Person p) {
		// TODO Auto-generated method stub
		p.increaseMana(3);
	}

	@Override
	public void addBeastCard(Person p) {
		// TODO Auto-generated method stub
		p.deck.add(new BeastCard("99"));
	}


}
