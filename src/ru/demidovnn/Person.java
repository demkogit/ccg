package ru.demidovnn;

public class Person implements IAttack {
	private int strength;
	private int health;
	private int maxHealth;
	private int mana;
	private boolean alive = true;
	Deck deck;
	
	public Person(int strength, int health, int mana, Deck deck){
		this.strength = strength;
		this.health = health;
		this.deck = deck;
		this.mana = mana;
		this.maxHealth = health;
		deck.setOwner(this);
	}
	
	public boolean isAlive(){
		return alive;
	}
	
	public int getMaxHealth(){
		return maxHealth;
	}
	public void setStrength(int strength){
		this.strength = strength;
	}
	
	public int getStrength(){
		return strength;
	}
	
	public void setHealth(int health){
		this.health = health;
	}
	
	public int getHealth(){
		return health;
	}

	public void increaseMana(int mana){
		this.mana += mana;
	}

	@Override
	public void attack(BeastCard beast) {
		// TODO Auto-generated method stub
		beast.getDamage(strength);
	}


	@Override
	public void attack(Person person) {
		// TODO Auto-generated method stub
		person.getDamage(strength);
	}


	@Override
	public void getDamage(int damage) {
		// TODO Auto-generated method stub
		if(health > 0) 
			health -= damage;
		else 
			alive = false;
	}
		
	
}
