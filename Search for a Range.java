/*Search for a Range
Given a sorted array of integers, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

For example,
Given [5, 7, 7, 8, 8, 10] and target value 8,
return [3, 4].*/

public class Solution {
    public int[] searchRange(int[] nums, int target) 
    {
        int [] range={-1,-1};
        if(nums.length ==1 && nums[0]==target  )
        {
            range[0]=0;
            range[1]=0;
        }
        else
        {
            bsearch(nums,0,nums.length-1,target,range);
        }
        if(range[0]!=-1 && range[1]==-1)
        {
            range[1]=range[0];
        }
        return range;
    }
    
    public void bsearch(int[] nums, int lo, int hi, int t, int[] range)
    {
        int mid=(lo+hi)/2;
        if(lo>hi)
        {
            return;
        }
        if(nums[lo]== nums[hi] && nums[lo]==t)
        {
            //System.out.println("i m here");
            range[0]= lo;
            range[1]= hi;
            return;
        }
        
        
        if(nums[mid]<t)
        {
            bsearch(nums,mid+1,hi,t,range);
        }
        else if(nums[mid]>t)
        {
            bsearch(nums,lo,mid-1,t,range);
        }
        else
        {
            
            range[0]=mid;
            range[1]=mid;
            while(mid>0 && nums[mid-1]==t)
            {  
                range[0]=mid-1;
                mid--;
            }
            
            while(mid+1<nums.length && nums[mid+1]==t)
            {   
               
                range[1]=mid+1;
                mid++;
            }
            return;
        }
       
    }
    
}