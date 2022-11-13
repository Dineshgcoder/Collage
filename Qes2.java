

import java.util.Scanner;

public class Qes2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value...");
		char ch=sc.next().charAt(0);
		
		if(ch>='a' && ch<='z') 
		{
			System.out.println("It is lowercase..");
		}
		else if(ch>='A' && ch<='Z')
		{
			System.out.println("It is uppercase..");
		}

	}

}
