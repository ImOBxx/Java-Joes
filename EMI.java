import java.util.Scanner;

public class EMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double pri, rate, time, emi;
		System.out.print("Enter the Principal: ");
		pri = in.nextDouble();
		System.out.print("Enter The Rate: ");
		rate = in.nextDouble();
		System.out.print("Enter Time in Year : ");
		time = in.nextDouble();
		rate = rate / (12 * 100);
		time = time * 12;
		emi = (pri * rate * Math.pow(1 + rate, time)) / (Math.pow(1 +rate,  time) - 1);
		System.out.println("Monthly EMI is : " + emi + "\n");
		

	}

}
