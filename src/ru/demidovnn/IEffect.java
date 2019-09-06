package ru.demidovnn;

public interface IEffect {
	public void damage(Person p);
	public void damage(BeastCard c);
	public void heal(Person p);
	public void heal(BeastCard c);
	public void addStrength(Person p);
	public void addStrength(BeastCard c);
	public void addMana(Person p);
	public void addBeastCard(Person p);
}
