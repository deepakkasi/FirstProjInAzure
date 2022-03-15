package basics;
import java.util.Scanner;
public class ConditionStatements {
	public static void main(String[] args) {
		int  value1,value2 ;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Value 1= ");
		value1 = scan.nextInt();
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter The Value2 = ");
		value2 = scan.nextInt();
		if (value1 < value2) {
			System.out.println("value1 is lesser than value2 ");
		}
		else {
			System.out.println("value1 is greater than value2 ");
		}
		System.out.println("------------------------------ Switch Statement Program-------------------------------");
				System.out.println("Enter the letter : ");
		Scanner scan3= new Scanner(System.in);
		String Letter =scan3.nextLine();
		 switch (Letter) {
		 case "a" :		 
			 System.out.println("The Entered Letter is a vowel");
			 break;					 
		 case "e" :	
			 System.out.println("The Entered Letter is a vowel");
		 		 case "i":
		 			 System.out.println("The Entered Letter is a vowel");
		 		 case "o":
		 			 System.out.println("The Entered Letter is a vowel");
		 		 case "u":
		 			 System.out.println("The Entered Letter is a vowel");
		 		 default:
			 System.out.println("The Enterd Letter is a Consanant");
		 
			 break;
		  }
		System.out.println("THANKYOU");
		
	}

}
