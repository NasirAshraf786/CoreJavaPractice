
import java.util.Scanner;

   public class Result
  {

        public static void main(String args[])
		{
           Scanner sc = new Scanner(System.in);
		   
		   System.out.println("ENTER YOUR ALL THREE SUBJECT MARKS : ");
		   
		   int phy = sc.nextInt();
		   int che = sc.nextInt();
		   int mat = sc.nextInt();
		   
		   float percentage = ((phy + che + mat)/300)/`100;
		   
		   if(percentage >= 40)
		   System.out.println("CONGRATULATION!! YOU ARE PASS ");
		   
		   else
		   System.out.println("SORRY!! YOU ARE FAILED ");
		   
		   
        }
    }