package forLoops;

public class Assignment6_LargestDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 59371;
		int digit = 0;
		
		for(;num>0;)
		{
			int temp = num%10;
			if (temp>digit)
			{
				digit = temp;
			}
			num = num/10;
		}
		System.out.println(+digit);
	}

}
