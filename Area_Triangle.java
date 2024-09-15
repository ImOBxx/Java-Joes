import java.util.Scanner;

public class Area_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double base, height, area;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Base Width : ");
		base = in.nextDouble();
		System.out.println("Enter the Height : ");
		height = in.nextDouble();
		area = (base * height) / 2;
		System.out.println("Area of a Triangle: " + area);

	}

}
