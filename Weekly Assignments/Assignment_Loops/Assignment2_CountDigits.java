package loops;

public class Assignment2_CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 987654;
		int count = 0;
		
		for(int i=num; i!=0; i=i/10)
		{
			count = count+1;
		}
		System.out.println("Number of digits = "+count);

	}

}
