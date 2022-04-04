package com.bridgelab.workshop;
import java.util.Random;

public class GamblerSimulation {
	
//	Total Money Won in betting will be stored here (Instance Variable)
	private int totalmoney;

//	Main Gambling Logic
	public static void gamble(int gamblerstartstake, int gamblerbet) {
//		Random object is created
		Random random = new Random();
		
		int gamble;
		gamble=random.nextInt(2);
		
		if(gamble==1) {
//			Object Created
			GamblerSimulation gamblerwon = new GamblerSimulation();
			System.out.println("Gambler Won");
//			Checking how much value won
			gamblerwon.totalmoney=gamblerstartstake+gamblerbet;
			System.out.println("Total Money Won="+gamblerwon.totalmoney);
		}else {
//			Object Created
			GamblerSimulation gamblerloss = new GamblerSimulation();
			System.out.println("Gambler Lost");
//			Checking how much value lost
			gamblerloss.totalmoney=gamblerstartstake-gamblerbet;
			System.out.println("Total Money Loss="+gamblerloss.totalmoney);
		}
	}
	
	public static void main(String[] args) {
//		Gambler Stake and Bet Values
		final int gamblerstartstake=100;
		final int gamblerbet=1;
		
		gamble(gamblerstartstake,gamblerbet);
	}
}
