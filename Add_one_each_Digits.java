import java.util.Scanner;

public class Add_one_each_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Five Digits Numbers : ");
		int num = in.nextInt();
		System.out.println("Original Digits : " + num);
		int a, sum = 0;
		a = (num / 10000) + 1;
		num = num % 10000;
		sum = sum + (a * 10000);
		a = (num / 1000) + 1;
		num = num  % 1000;
		sum = sum + (a * 1000);
		a = (num / 100) + 1;
		num = num % 100;
		sum = sum + (a * 100);
		a = (num / 10) + 1;
		num = num % 10;
		sum = sum + (a * 10);
		a = num + 1;
		sum = sum + a;
		System.out.println("Adding One To Each Digits : " + sum);
		
		

	}

}
