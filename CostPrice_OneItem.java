import java.util.Scanner;

public class CostPrice_OneItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Selling Price : ");
		float sp = in.nextFloat();
		System.out.println("Enter the Profit : ");
		float profit = in.nextFloat();
		float cp = sp - profit;
		cp = cp / 15;
		System.out.println("Cost Price Per Item : " + cp);

	}

}
