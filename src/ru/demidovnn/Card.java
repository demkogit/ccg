package ru.demidovnn;

public abstract class Card {
	String name;
	String description;
	int cost;
	
	public void setDescription(String description){
		this.description = description;
	}
	
	public void setCost(int cost){
		this.cost = cost;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public Card(String name){
		this.setName(name);
	}
}
