package loops;

public class Assignment3_SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 4567;
		int sum = 0;
		for(int i=num;i>0;i=i/10) 
		{
			int value = i%10;
			sum = sum + value;
		}
		
		System.out.println("Sum of digits = " +sum);

	}

}
