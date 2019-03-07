package com.dicegame;

public class Player {
	
	int value;
	

	
	void throwDice(Dice d1,Dice d2)
	{
		d1.roll();
		d2.roll();
		value=d1.faceValue+d2.faceValue;
		
		
	}

}
