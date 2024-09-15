import java.util.Scanner;

public class Different_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name, gen;
		char gra;
		int age, tot;
		float per;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Name : ");
		name = in.nextLine();
		System.out.print("Enter Gender (Male/Female) : ");
		gen = in.next();
		System.out.print("Enter the Age : ");
		age = in.nextInt();
		System.out.print("Enter the Total : ");
		tot = in.nextInt();
		System.out.print("Enter the Percentage : ");
		per = in.nextFloat();
		System.out.print("Enter the Grade : ");
		gra = in.next().charAt(0);
		System.out.println("Name      : " + name);
		System.out.println("Gender    : " + gen);
		System.out.println("Age       : " + age);
		System.out.println("Total     : " + tot);
		System.out.println("Percentage: " + per);
		System.out.println("Grade     : " + gra);
		
 		
		
		
		

	}

}
