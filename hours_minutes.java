import java.util.Scanner;

public class hours_minutes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int seconds = 0;
		System.out.println("Enter the seconds: ");
		seconds = in.nextInt(); 
		int sec = seconds % 60;
		int hour = seconds / 60;
		int min = hour % 60;
		hour = hour / 60;
		System.out.print("\n");
		System.out.println(hour + ":" + min + ":" + sec);
		
		

	}

}
