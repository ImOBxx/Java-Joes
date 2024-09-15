import java.util.Scanner;

public class Currency_Notes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Amount to be withdrawn : ");
		int amt = in.nextInt();
		int hundred = amt / 100;
		amt = amt % 100;
		int fifty = amt / 50;
		amt = amt % 50;
		int ten = amt / 10;
		System.out.println("No. of hundreds notes : " + hundred);
		System.out.println("No. of Fifty Notes : " + fifty);
		System.out.println("No. of Ten Notes : " + ten);
		
		
		

	}

}
