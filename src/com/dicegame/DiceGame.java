package com.dicegame;

public class DiceGame {

	public static void main(String[] args) {

		/*
		 * Object Creation
		 * Syntax
		 * classname variablename;
		 * variablename=new classname();
		 * 
		 * classname variablename=new classname();
		 * 
		 * 
		 * 
		 * 
		 * EXa
		 * 
		 * Dice d1=new Dice();
		 * Dice d2-new Dice();;
		 * Player p1=new Player();
		 */
		
		// create dice objects
		Dice diceOne=new Dice();
		Dice diceTwo=new Dice();
		//create Player
		Player playerOne=new Player();
		Player playerTwo=new Player();
		playerOne.throwDice(diceOne, diceTwo);
		playerTwo.throwDice(diceOne, diceOne);
		if(playerOne.value>playerTwo.value)
		{
			System.out.println("PlayerOne Won The Game");
		}
		else
		{
			System.out.println("Player Two won The Game");
		}
		
	}

}
