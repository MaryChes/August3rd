package com.notes.wednesday;

public class TwelveDaysOfXMas 
{
	//Switch Statements
public static void main(String[] args) 
{
	for(int day = 1; day <= 12; day++)
	{
		System.out.print("On the " + day);
		
		switch (day) 
		{
		case 1:
			System.out.print("st");
			break;
		case 2:
			System.out.print("nd");
			break;
		case 3:
			System.out.print("rd");
			break;
		default:
			System.out.print("th");
			break;
		}
		System.out.println(" day of Christmas my true love gave to me");
		
		switch (day)
		{
		case 12:
			System.out.println("\tTwelve drummers drumming.");
			System.out.println();
			break;
		case 11:
			System.out.println("\tEleven pipers piping.");
			System.out.println();
			break;	
		case 10:
			System.out.println("\tTen lords a-leaping.");
			System.out.println();
			break;
		case 9:
			System.out.println("\tNine ladies dancing.");
			System.out.println();
			break;
		case 8:
			System.out.println("\tEight maids a-milking.");
			System.out.println();
			break;
		case 7:
			System.out.println("\tSeven swans a-swimming.");
			System.out.println();
			break;
		case 6:
			System.out.println("\tSix geese a-laying.");
			System.out.println();
			break;
		case 5:
			System.out.println("\tFive gold rings.");
			System.out.println();
			break;
		case 4:
			System.out.println("\tFour calling birds.");
			System.out.println();
			break;
		case 3:
			System.out.println("\tThree French hens.");
			System.out.println();
			break;
		case 2:
			System.out.println("\tTwo turtle doves.");
			System.out.println();
			break;
		default:
			System.out.println("\t A partridge in a pear tree.");
			System.out.println();
		}
			
		
		
		
	}
}
}


