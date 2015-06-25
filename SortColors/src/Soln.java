//Question Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.
//Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

public class Soln {

// Time Complexity O(n)	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {0,0,1,2,1,2,1,2,0,1};
		  
		sortColors(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
	}
	
	public static void sortColors(int[] A) 
	{
        int zeroPosition = 0;
        int onePosition = 0;
        int twoPosition = 0;
        for(int i = 0; i < A.length; i++)
        {
            //Storing the boundary for 0,1,2 and intializing 0
        	if (A[i] == 0){
                A[twoPosition] = 2;
                A[onePosition] = 1;
                A[zeroPosition] = 0;
                zeroPosition++;
                onePosition++;
                twoPosition++;
            }
        	
        	//Storing the boundary for 1,2 and intializing 1
            else if (A[i] == 1){
                A[twoPosition] = 2;
                A[onePosition] = 1;
                onePosition++;
                twoPosition++;
            }
        	
        	//Storing the boundary for 1,2 and intializing 2
            else if (A[i] == 2){
                A[twoPosition] = 2;
                twoPosition++;
            }
        }
    }


}
