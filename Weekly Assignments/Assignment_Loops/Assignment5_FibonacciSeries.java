package loops;

public class Assignment5_FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		int a = 0, b=1;
		
		for(int i=1; i<=num; i++)
		{
			System.out.print(a+" ");
			int temp = a+b;
			a = b;
			b = temp;
		}

	}

}
