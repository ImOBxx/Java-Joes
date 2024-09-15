import java.util.Scanner;

public class Reverse_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter theb Five Digits Numbers: ");
		int num = in.nextInt();
		System.out.println("Before Reverse : " + num);
		int rem, rev = 0;
		rem = num % 10;
		num = num / 10;
		rev = rev + rem * 10000;
		
		rem = num % 10;
		num = num / 10;
		rev = rev + rem * 1000;
		
		rem = num % 10;
		num = num / 10;
		rev = rev + rem * 100;
		
		rem = num % 10;
		num = num/ 10;
		rev = rev + rem * 10;
		rem = num % 10;
		rev = rev + rem;
		System.out.println("After Reverse : " + rev);

	}

}
