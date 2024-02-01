package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your start amount: ");
		Double startAmount = in.nextDouble();
		System.out.print("Enter your win chance (1-3 dignits for percentage,1-100): ");
		Double winChance = in.nextDouble();
		System.out.print("Enter your win limit: ");
		Double winLimit = in.nextDouble();
		System.out.print("Enter the total simulations: ");
		Double totalSimulations = in.nextDouble();
		int win;
		int ruinTime = 0;
		int successTime = 0;
		for (int count = 1; count <= totalSimulations; count++)
		{
		int gamePlayed = 0;
		double realAmount = startAmount;
		 while (realAmount >= 0 && realAmount<=winLimit)
	     {
			win = (int)(Math.random()*100) + 0;
			boolean winStatus = (win<=winChance);
	        if (winStatus)
	        {
	        realAmount = realAmount + 1;
	        }
	        else
	        {
	        realAmount = realAmount - 1;
	        }
	        gamePlayed = gamePlayed + 1;
	     }
		 boolean winOrLoose = (realAmount>=winLimit);
		 if (winOrLoose)
		 {
		 System.out.println("Simulation " + count + "  " + gamePlayed + " Success");
		 successTime= successTime + 1;
		 }
		 else
		 {
			 System.out.println("Simulation " + count + "  " + gamePlayed + " Ruin");
			 ruinTime= ruinTime + 1;
		 }
		
		
	}

		boolean method = (winChance==50);
		if (method)
		{
			double expectedRuin = 1-startAmount/winLimit;
		}
		else
		{
			double a = (1-winChance)/winChance; 
			double expectedRuin = 0;
		}
		
		System.out.println("Total simulations: " +totalSimulations); 
		System.out.println("Success days:" +successTime);
		System.out.println("Ruin days:" +ruinTime);
		System.out.println("Ruin Rate from Simulation: " + ruinTime/totalSimulations + "Expected Ruin Rate: ");
}
}
