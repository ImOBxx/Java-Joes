import java.util.Scanner;


public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float m, km, cm, i, ft;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Kilometer: ");
		km = in.nextFloat();
		m = km * 1000;
		cm = m * 100;
		i = cm / 2.54f;
		ft = i / 12;
		System.out.println("Kilometer : " + km);
		System.out.println("Meters : " + m);
		System.out.println("Centimeters : " + cm);
		System.out.println("Inches : " + i);
		System.out.println("Feet : " + ft);
		
		
		

	}

}
