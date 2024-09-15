import java.util.Scanner;

public class Area_of_a_rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double len;
		double wid;
		double area;
		System.out.println("Enter the Length : ");
		len = in.nextDouble();
		System.out.println("Enter the width : ");
		wid = in.nextDouble();
		area = len * wid;
		System.out.println("Area of Rectangle : " + area);
	}

}
