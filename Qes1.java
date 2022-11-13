import java.util.Scanner;

public class Qes1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value...");
		char ch=sc.next().charAt(0);
		
		if((ch>='a' && ch<='z') ||(ch>='A' && ch<='Z'))
		{
			System.out.println("It is character..");
		}
		else if(ch>='0' && ch<='9')
		{
			System.out.println("It is digit..");
		}else 
		{
			System.out.println("It is Special character..");	
		}
		

	}

}
