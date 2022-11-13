

import java.util.Scanner;

public class Ques4 {

	public static void main(String[] args) {
		
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter month...");
		num=sc.nextInt();
		
		if(num==1) 
		{
			System.out.println("Jan 31 days");
		}
		else if(num==2)
		{
			System.out.println("Feb 28 days");
		}
		else if(num==3)
		{
			System.out.println("Mar 31 days");
		}
		else if(num==4)
		{
			System.out.println("Apr 30 days");
		}
		else if(num==5)
		{
			System.out.println("May 31 days");
		}
		else if(num==6)
		{
			System.out.println("Jun 30 days");
		}
		else if(num==7)
		{
			System.out.println("July 31 days");
		}
		else if(num==8)
		{
			System.out.println("Aug 31 days");
		}
		else if(num==9)
		{
			System.out.println("Sep 30 days");
		}
		else if(num==10)
		{
			System.out.println("Oct 31 days");
		}
		else if(num==11)
		{
			System.out.println("Nov 30 days");
		}else if(num==12)
		{
			System.out.println("Dec 31 days");
		}
		else {
			System.out.println("Invalid month");
		}

	}

}
