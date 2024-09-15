import java.util.Scanner;

public class interchange_values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the A & B Numbers: ");
	    a = in.nextInt();
	    b = in.nextInt();
		System.out.println("Before Interchange A : "+a+" || B : "+b);
		int c = a;
		a = b;
		b = c;
		System.out.println("After Interchange A : "+a+" || B : "+b);
		
		

	}

}
