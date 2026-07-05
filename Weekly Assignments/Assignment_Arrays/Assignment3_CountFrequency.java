package Arrays;

public class Assignment3_CountFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4, 2, 4, 6, 2, 2, 7};
		
		for (int i=0;i<arr.length;i++)
		{
			boolean Iscount = false;
			
			for (int j = 0; j < i; j++) 
			{
                if (arr[i] == arr[j]) 
                {
                	Iscount = true;
                    break; 
                }
            }
			if (!Iscount) 
			{
                int count = 1; 
                for (int j = i + 1; j < arr.length; j++) 
                {
                    if (arr[i] == arr[j]) 
                    {
                        count++;
                    }
                }

                System.out.println(arr[i] + " occurs " + count+" times.");
			}
		}
		

	}

}
