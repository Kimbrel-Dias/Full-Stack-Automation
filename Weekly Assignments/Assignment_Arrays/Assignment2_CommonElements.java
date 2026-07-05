package Arrays;

public class Assignment2_CommonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {2, 5, 7, 9, 11, 5};
		int arr2[] = {1, 5, 7, 15, 20, 5};

		for (int i=0; i<arr1.length;i++)
		{
			boolean IsCommon = false;
			
			for (int j=0; j<i;j++)
			{
				if (arr1[i] == arr1[j]) {
					IsCommon = true;
                    break;
                }
            }
            if (IsCommon) {
                continue; 
            }
			
			for (int k=0; k<arr2.length;k++)
			{
				if(arr1[i]==arr2[k])
				{
					System.out.println(arr1[i]+" ");
					break;
				}
			}
			
			}
		}

	

}
