import java.util.Scanner;

public class Subtract_WithoutMinus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num1 = 0, num2 = 0, sub = 0;
		System.out.println("Enter The Number 1 : ");
		num1 = in.nextInt();
		System.out.println("Enter The Number 2 : ");
		num2 = in.nextInt();
		sub = num1 + ~num2 + 1;
		System.out.println("Subtraction without using Minus(-) operator..");
		System.out.printf("Subtraction of %d - %d = %d", num1, num2, sub);

	}

}
