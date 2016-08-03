package com.notes.wednesday;

public class Methods 
{
	public static void main(String[] args) 
	{
		boolean doWeHaveAllTheNotebooks = true;
		
		//Went to count books and found one missing thus
		doWeHaveAllTheNotebooks = false;
		notebook(doWeHaveAllTheNotebooks); 
		String whatHappened = notebook(doWeHaveAllTheNotebooks);
		System.out.println(whatHappened);
		
		System.out.println();
		String doThisNext = whatHappened + "\nDo you know where the book is?";
		System.out.println(doThisNext);
	}
	
	public static String notebook(boolean isLost)
	{
		String whatToDoNow = null;
		
		if (isLost)
		{
			whatToDoNow = "Good, we have all the books.";
		}
		else
		{
			whatToDoNow = "Blame the students";
		}
		return whatToDoNow;
	}
}
