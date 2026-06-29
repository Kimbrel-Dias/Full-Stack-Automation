package loops;

public class Assignment1_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 6;
		int fact = 1;
		for(int i=num;i>0;i--) 
		{
			fact = fact * i;
		}
		
		System.out.println("Factorial of "+num +" = " +fact);

	}

}
