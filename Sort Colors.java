/*Sort Colors
Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
*/

public class Solution {
    public void sortColors(int[] nums) 
    {
                int zeroPosition = 0;
        int onePosition = 0;
        int twoPosition = 0;
        for(int i = 0; i < nums.length; i++)
        {
            //Storing the boundary for 0,1,2 and intializing 0
        	if (nums[i] == 0){
                nums[twoPosition] = 2;
                nums[onePosition] = 1;
                nums[zeroPosition] = 0;
                zeroPosition++;
                onePosition++;
                twoPosition++;
            }
        	
        	//Storing the boundary for 1,2 and intializing 1
            else if (nums[i] == 1){
                nums[twoPosition] = 2;
                nums[onePosition] = 1;
                onePosition++;
                twoPosition++;
            }
        	
        	//Storing the boundary for 1,2 and intializing 2
            else if (nums[i] == 2){
                nums[twoPosition] = 2;
                twoPosition++;
            }
        }
    }

    
}
