import java.util.Scanner;

public class Exact_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str, num;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Paragraphs : ");
		str = in.nextLine();
		num = str.replaceAll("[^0-9]", "");
		System.out.println("Numbers are : " + num);
		
		

	}

}
