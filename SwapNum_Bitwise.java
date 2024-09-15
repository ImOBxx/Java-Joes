import java.util.Scanner;

public class SwapNum_Bitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		System.out.println("Enter the Number 1 : ");
		num1 = in.nextInt();
		System.out.println("Enter the Number 2 : ");
		num2 = in.nextInt();
		System.out.printf("Before Swapping num1 : %d || Num2 : %d", num1, num2);
		num1 = num1 ^ num2;
		num2 = num1 ^ num2;
		num1 = num1 ^ num2;
		System.out.printf("\nAfter Swapping Num1 : %d || Num2 : %d", num1, num2);
		

	}

}
