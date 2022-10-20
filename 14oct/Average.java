//program to find average of three number using Scanner class

import java.util.Scanner;

public class Average
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter three numbers : ");
		int number1 = sc.nextInt();
		float number2 = sc.nextFloat();
		byte number3 = sc.nextByte();
		
		float avr = (number1 + number2+ number3)/3;
		System.out.println("Average of three numbers are " +avr);
	}
}