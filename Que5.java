

import java.util.Scanner;

public class Que5 {

	public static void main(String[] args) {
		
		int rollno;
		String name;
		int hindi;
		int english;
		int math;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Rollno...");
		rollno=sc.nextInt();
		System.out.println("Enter your Name..");
		name=sc.next();
		System.out.println("Enter your 3 Subjects marks...");
		System.out.println("Enter your Hindi Marks");
		hindi=sc.nextInt();
		System.out.println("Enter your English Marks");
		english=sc.nextInt();
		System.out.println(" Enter your Math Marks");
		math=sc.nextInt();
		
		int total=hindi+english+math;
		float percentage=(total)/3.0f;
		
		System.out.println();
		System.out.println("Roll No:"+rollno);
		System.out.println("Student Name:"+name);
		
		System.out.println("Subjects");
		System.out.println("Hindi marks: "+hindi);
		System.out.println("English marks: "+english);
		System.out.println("Math marks: "+math);
		
		System.out.println("Total number : "+total);
		System.out.println("Percentage: "+percentage);
		
		if(percentage>=90)
		{
			System.out.println("Grade A");
		}
		else if(percentage>=70)
		{
			System.out.println("Grade B");
		}
		else if(percentage>=60)
		{
			System.out.println("Grade C");
		}
		else if(percentage>=50)
		{
			System.out.println("Grade D");
		}
		else {
			System.out.println("Grade F");
			System.out.println("Do work hard!!");
		}
		
		
		
		
		

	}

}
