package com.basics.junit.cotrollers;

public class MainController {

	public boolean palindromeCheck(String inputString)
	{
		int lastIndex=inputString.length()-1;
		int startIndex=0;
		int flagCheck=0;
		
		while(startIndex<lastIndex)
		{
			if(inputString.charAt(startIndex)!=inputString.charAt(lastIndex))
			{
				flagCheck=1;
				break;
			}
			startIndex++;
			lastIndex--;
		}
		
		if(flagCheck==1)
		{
			return false;
		}
		else
		{
			return true;
		}
		
	}
	
	public int divisionCheck(int a,int b)
	{
		return a/b;
	}

}
