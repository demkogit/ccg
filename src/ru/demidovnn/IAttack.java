package ru.demidovnn;

public interface IAttack {
	void attack(BeastCard beast);
	void attack(Person person);
	
	void getDamage(int damage);
	
}
