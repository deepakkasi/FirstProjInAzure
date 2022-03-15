package basics;

import java.util.Scanner;
public class calculator {
	public static void main(String[] args) {
		int sum ,sub,mul,rem;
		double div;
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter the value 1");
		int FirstValue = scan1.nextInt();
		System.out.println("Enter the value 2");
		int SecondValue = scan2.nextInt();
		sum=FirstValue + SecondValue;
		sub = FirstValue - SecondValue;
		mul = FirstValue * SecondValue;
		div =FirstValue / SecondValue;
		rem = FirstValue % SecondValue;
		System.out.println("Sum Of The value " +FirstValue  + " And " + SecondValue +" is " +sum );
		System.out.println("Sub Of The value " +FirstValue  + " And " + SecondValue +" is " +sub );
		System.out.println("Mul Of The value " +FirstValue  + " And " + SecondValue +" is " +mul );
		System.out.println("Div Of The value " +FirstValue  + " And " + SecondValue +" is " +div);
		System.out.println("Rem Of The value " +FirstValue  + " And " + SecondValue +" is " +rem );
	}

}
