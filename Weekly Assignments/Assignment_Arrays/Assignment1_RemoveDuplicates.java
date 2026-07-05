package Arrays;

public class Assignment1_RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5, 3, 8, 5, 2, 3, 9, 8};
		
		for (int i=0; i<arr.length;i++)
		{
			boolean IsPresent = true;
			for(int j=0; j<i; j++) 
			{
				if (arr[i] == arr[j])
				{
					IsPresent = false;
					break;
				}
			}
			if (IsPresent)
			{
				System.out.println(arr[i]+" ");
			}
		}

	}

}
