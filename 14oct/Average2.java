//program to find average of three numbers using command line argument

public class Average2
{
   public static void main(String args[])
   {
     System.out.println("Enter three numbers : ");
     int num1 = Integer.parseInt(args[0]);
	 float num2 = Float.parseFloat(args[1]);
	 int num3 = Integer.parseInt(args[2]);
	 
	 float avg = (num1 + num2 + num3)/3;
	 System.out.println("AVERAGE OF THREE NUMBERS IS :" +avg);
   }
}