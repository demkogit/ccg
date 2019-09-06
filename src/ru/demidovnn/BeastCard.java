package ru.demidovnn;

import java.util.Random;

public class BeastCard extends Card implements IAttack{
	int strength;
	int health;
	int maxHealth;
	
	public BeastCard(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		Random r = new Random();
		this.strength = 1 + r.nextInt(3);
		this.health = 1 + r.nextInt(4);
		this.cost = this.strength + this.health - 1;
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
		if(health > 0) health -= damage;
	}


	
}
