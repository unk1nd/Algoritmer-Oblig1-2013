package oppgave3;

import java.util.Scanner;

public class vendeom 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
	    System.out.print("Skriv inn ord som skal snu: ");
	    String i = input.nextLine();
	    snuOm(i);
	}

	public static void snuOm(String value) 
	{
		if (value.length() > 0) 
		{
			System.out.print(value.charAt(value.length() - 1));
			snuOm(value.substring(0, value.length() - 1));
	    }
	}
}
