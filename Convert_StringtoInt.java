import java.util.Scanner;

public class Convert_StringtoInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number(string): ");
		String str1 = in.nextLine();
		int res = Integer.parseInt(str1);
		System.out.println("The Integer value is : " + res);

	}

}
