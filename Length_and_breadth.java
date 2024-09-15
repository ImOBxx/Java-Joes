import java.util.Scanner;

public class Length_and_breadth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double l;
		double b;
		double c;
		double r;
		double area;
		
		System.out.print("Enter the Length of the Rectangle: ");
		l = in.nextDouble();
		System.out.print("Enetr the Breadth of a Rectangle: ");
		b = in.nextDouble();
		area = l * b;
		System.out.println("The Area of the Rectangle: " + area);
		System.out.println("\n");
		System.out.print("Enter the Radius of a Circle: ");
		r = in.nextDouble();
		c = 2 * Math.PI * r;
		System.out.println("The Area of the Circle: " + c);
		}
		
		
		
		
		

	}


