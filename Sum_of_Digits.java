import java.util.Scanner;

public class Sum_of_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Five Digit Numbers: ");
		int num =in.nextInt();
		System.out.println("Original Digits : " + num);
		int rem, sum = 0;
		rem = num % 10;
		num = num / 10;
		sum = sum + rem;
		rem = num % 10;
		num = num / 10;
		sum = sum + rem;
		rem = num % 10;
		num = num / 10;
		sum = sum + rem;
		rem = num % 10;
		num = num / 10;
		sum = sum + rem;
		rem = num % 10;
		sum = sum + rem;
		System.out.println("Sum of Digits : " + sum);
		

	}

}
