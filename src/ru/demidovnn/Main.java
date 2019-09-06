package ru.demidovnn;

public class Main {
	public static void main(String[] args){
		Deck deck = new Deck();
		deck.add(new BeastCard("1"));
		deck.add(new BeastCard("2"));
		deck.add(new BeastCard("3"));
		deck.add(new BeastCard("4"));
		deck.add(new BeastCard("5"));
		deck.add(new BeastCard("6"));
		deck.add(new BeastCard("7"));
		deck.add(new BeastCard("8"));
		deck.add(new BeastCard("9"));
		deck.add(new BeastCard("10"));
		
		deck.shuffle();
		
		for(int i = 0; i < deck.size(); i++){
			System.out.println(deck.get(i).getName());
		}
		
		Person Hunter = new Person(3, 4, 2, deck);
		Person Archer = new Person(2, 3, 4, deck);
		
		while(Hunter.isAlive() && Archer.isAlive()){
			
			
			
			
			
			if(Hunter.deck.isEmpty())
				Hunter.getDamage(1);
			if(Archer.deck.isEmpty())
				Archer.getDamage(1);
		}
	}
}
