package com.bridgelabz;

import java.util.Random;

public class UC2 {
	static int stakePerDay = 100; //stake is in dollar
	static int betPerGame =  1 ; 
	static int totalStake = 100;
	public  static  void   gamblerStatus() {

	    Random random= new Random();  
		int bet = random.nextInt(2);

		if (bet==1) {
			System.out.println("You win a game");
			totalStake ++;
		} else {
			System.out.println("You lose a game");
			totalStake--;
		}
	
	System.out.println("Total stake after winning or losing " + totalStake);
	}
}
