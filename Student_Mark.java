import java.util.Scanner;

public class Student_Mark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double s1, s2, s3, s4, s5;
		System.out.println("Enter Subject 1 Marks: ");
		s1 = in.nextDouble();
		System.out.println("Enter Subject 2 Marks: ");
        s2 = in.nextDouble();
        System.out.println("Enter Subject 3 Marks: ");
        s3 = in.nextDouble();
        System.out.println("Enter Subject 4 Marks: ");
        s4 = in.nextDouble();
        System.out.println("Enter Subject 5 Marks: ");
        s5 = in.nextDouble();
        double sum = s1 + s2 + s3 + s4 + s5;
        double avg = (s1 + s2 + s3 + s4 + s5) / 500;;
        double percentage = avg * 100.0;
        System.out.println("Your Aggregate Score:  " + sum + " Marks");
        System.out.println("Your Percentage: " + percentage + "%");
        
        
        
        

	}

}
