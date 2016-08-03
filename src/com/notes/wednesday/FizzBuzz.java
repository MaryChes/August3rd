package com.notes.wednesday;


public class FizzBuzz 
{
	public static void main(String[] args) 	
	{
	//FizzBuzzBang
	//Test if 3 is cleanly divisible -replace w/fizz
	//Test if 5 is cleanly divisible -replace w/buzz
	//Test if 7 is cleanly divisible -replace w/bang
	
	for (int i = 1; i <= 110; i++)
	{
		if(((i % 3) == 0) && ((i % 5) == 0) && ((i % 7) == 0))
		{
		System.out.println("Fizz, Bang, Buzz");
		}
		else if (((i % 3) == 0) && ((i % 5) == 0))
		{
			System.out.println("Fizz Buzz");
		}
		else if (((i % 3) == 0) && ((i % 7) == 0))
		{
			System.out.println("Fizz Bang");
		}
		else if (((i % 5) == 0) && ((i % 7) == 0))
		{
			System.out.println("Buzz Bang");
		}
		else if ((i % 3) == 0)
		{
			System.out.println("Fizz");
		}
		else if ((i % 5) == 0)
		{
			System.out.println("Buzz");
		}
		else if ((i % 7) == 0)
		{
			System.out.println("Bang");
		}
		else 
		{
		System.out.println(i);
		}
	}
	
	
	
}
}
