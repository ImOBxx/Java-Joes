import java.util.Scanner;

public class Celsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double f;
		double c;
	    System.out.println("Enter city temp. in (F): ");
	    f = in.nextDouble();
	    c = (f - 32) * 5 / 9.0;
	    System.out.println("The Temp. in degree celsius : " + c);
	    
	   
				

	}

}
