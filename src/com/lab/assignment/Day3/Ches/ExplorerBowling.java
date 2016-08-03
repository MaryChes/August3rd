package com.lab.assignment.Day3.Ches;

public class ExplorerBowling {
	public static void main(String[] args) 
	{
		int framesInBowling = 10;
		int pinsPerFrame = 10;
		int throwsPerFrame = 2;
		int[] finalScore = new int[10];
	
		for (int i = 0; i < framesInBowling; i++)
		{
			
			int scoreForFirstRoll = ((int) (Math.random() * (pinsPerFrame  + 1)));
			int pinsRemaining = pinsPerFrame - scoreForFirstRoll;
			int scoreForSecondRoll = ((int) (Math.random() * (pinsRemaining  + 1)));
			int frameScore = scoreForFirstRoll + scoreForSecondRoll;
			finalScore [i] = frameScore;
			
			
			System.out.println("Your first roll score is " + scoreForFirstRoll);
			System.out.println("Your second roll score is " + scoreForSecondRoll);
			System.out.println("Your score for this frame is " + frameScore);
			System.out.println();			
		}
		System.out.println("This game, you bowled " + (finalScore[0] + finalScore[1] + finalScore[2] + finalScore[3] + finalScore[4] + finalScore[5] + finalScore[6] + finalScore[7] + finalScore[8] + finalScore[9]));
		
		
		
//		BILL SHOWED ME THIS SHORT CUT FOR THE FINAL SCORE. I WILL TRY TO INCORPORATE IT IN ANOTHER MODE
//		for (int i = 0; i < finalScore.length; i++)
//		{
//		totalScore = totalScore + finalScore[i];
//		}
//		System.out.println("This game was" + totalScore);
//		}
}}

