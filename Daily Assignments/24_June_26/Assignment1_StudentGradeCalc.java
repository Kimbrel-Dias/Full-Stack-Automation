package loops;
import java.util.Scanner;

public class Assignment1_StudentGradeCalc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks (out of 100): ");
        float marks = sc.nextFloat();
        int marksT = (int)marks;
        
        if(marksT>=90)
        {
        	System.out.println("A");
        }
        else if(marksT>=75)
        {
        	System.out.println("B");
        }
        else if(marksT>=60)
        {
        	System.out.println("C");
        }
        else if(marksT>=40)
        {
        	System.out.println("D");
        }
        else
        {
        	System.out.println("Fail");
        }

	}

}
