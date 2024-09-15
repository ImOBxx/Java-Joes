import java.util.Scanner;

public class Perimeter_of_a_circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double r;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Radius of Circle : ");
		r  = in.nextDouble();
		double per = 2 * 3.14 * r;
		System.out.println("Perimeter of Circle: " + per);

	}

}
