package ru.demidovnn;

import java.util.ArrayList;
import java.util.Random;

public class Deck extends ArrayList<Card>{
	Person owner;
	
	public void setOwner(Person owner){
		this.owner = owner;
	}
	
	public Person getOwner(){
		return this.owner;
	}
	
	public void shuffle(){
		if(this.isEmpty()){
			System.out.println("Невозвозможно перетасовать колоду, она пустая");
		}else{
			Card tempCard;
			Random rand = new Random();
			
			for(int i = 1; i < this.size(); i++){
				int j = rand.nextInt(i);
				tempCard = this.get(i);
				this.set(i, this.get(j));
				this.set(j, tempCard);
			}
		}
	}
	
	public Card pop(){
		if(this.isEmpty()){
			System.out.println("Колода пустая!");
			return null;
		}else{
			int lastIndex = this.size()-1;
			Card lastCard = this.get(lastIndex);
			this.remove(lastIndex);
			return lastCard;
		}
	}
}
