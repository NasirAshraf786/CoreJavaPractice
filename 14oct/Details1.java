//PROGRAM TO PRINT ALL DETAILS USING SCANNER CLASS

import java.util.Scanner;
 
 public class Details1
 {
    public static void main(String args[])
	   {
	       Scanner sc = new Scanner(System.in);
		   
		   System.out.print("ENTER YOUR NAME : ");
		   String a = sc.nextLine();
		   
		   System.out.print("\n ENTER YOUR GENDER : ");
		   char b = sc.next().charAt(0);
		   
		   System.out.print("\n ENTRER YOUR PINCODE : ");
		   int c = sc.nextInt();
		   
		   System.out.print("\n ENTER WEIGHT OF YOUR LAPTOP : ");
		   float d = sc.nextFloat();
		   
		   System.out.print("\n ARE YOU WRITING THIS PROGRAM(true/false) : ");
		   boolean e = sc.nextBoolean();
		   
		   System.out.println("NAME " +a+ "\nGENDER : " +b+ "\nPINCODE :" +c+ "\nLAPTOP WEIGHT :" +d+ "\n HAVE YOU WRITTEN THIS PROGRAM ? : " +e);
	   }
 }