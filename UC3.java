package com.bridgelabz;

import java.util.Random;

public class UC3 {
	static int stakePerDay = 100; //stake is in dollar
	static int betPerGame =  1 ; 
	static int totalStake = 100;
    static int totalChance = 150;
	  void winLost() {
		for (int i = 1; i <= totalChance; i++) {
			if(totalStake <= 50 || totalStake >= 150) {
				System.out.println("You crossed your limit!");
				System.out.println("Game is over!");
				break;
			}else {

                Random random= new Random();  
				int bet = random.nextInt(2);

				if (bet==1) {
					System.out.println("You win a game");
					totalStake ++;
				} else {
					System.out.println("You lose a game");
					totalStake--;
				}

				
			}
			System.out.println("Total stake after winning or losing " + totalStake);
		}		

	}
}
