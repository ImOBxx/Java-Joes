import java.util.Scanner;

public class Area_Of_A_Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double rad;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Radius of Circle: ");
		rad = in.nextDouble();
		double area = Math.PI * rad * rad;
		System.out.println("Area of Circle : " + area);

	}

}
