package basics;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		System.out.println("Enter The Number ");
		Scanner scan = new Scanner (System.in);
		int Number = scan.nextInt();
		int temp = Number;
		int sum=0,Rem;	
		while(Number > 0) {
		Rem= Number % 10;
		sum=(sum*10)+Rem;
		Number=Number/10;
		}
		if (sum == temp)
		{
			System.out.println("Its A Palindrome");
			
		}
		else {
			System.out.println("Not A Palindrome");
		}
	}

}
