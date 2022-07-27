package Calculator;
import java.util.Scanner;
public class ArithmeticCalculator {
public static void main(String[] args) {
	double op1;
	double op2;
	double result;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1st value: ");
	op1 = sc.nextDouble();
	System.out.println("Enter 2nd value: ");
	op2 = sc.nextDouble();
	char choice = 0;
	choice = sc.next().charAt(0);
	if(choice == '+') {
	result = op1+op2;
	System.out.println("The sum is: " + result);
	}
	else if (choice == '-') {
	result = op1-op2;
	System.out.println("The diff is: " + result);
	}
	else if (choice == '*') {
	result = op1*op2;
	System.out.println("The product is: " + result);
	}
	else if (choice == '/') {
	result = op1/op2;
	System.out.println("The quotient is: " + result);
	}
	else {
	System.out.println("error");
	}
}
}




