package com.dicegame;

public class Dice {

	int faceValue;// property or attribute or variable
	void roll() // behaviour or opration or method
	{
	// 1 to 6	
		faceValue = (int)((Math.random())*10)%5+1;
		
		
	}

}
