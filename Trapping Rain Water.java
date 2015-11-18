/*Trapping Rain Water
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.

For example, 
Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.*/

public class Solution {
    public int trap(int[] arr) {
        
    int res=0;
    if(arr.length==0|| arr==null)
        return 0;
    
    int left[]=new int[arr.length];
    int right[]=new int[arr.length];
    
    int mx=arr[0];
    left[0]=arr[0];
    for(int i=1;i<arr.length;i++)
    {
        if(arr[i]<mx)
            left[i]=mx;
        else
        {
            left[i]=arr[i];
            mx=arr[i];
        }
        
    }
    
    //lef[0]
    mx=arr[arr.length-1];
    right[arr.length-1]=arr[arr.length-1];
    for(int i=arr.length-2;i>=0;i--)
    {
        if(arr[i]<mx)
            right[i]=mx;
        else
        {
            right[i]=arr[i];
            mx=arr[i];;
        }    
    }
    
    for(int i=0;i<arr.length;i++)
    {
    
        res+=Math.min(left[i],right[i])-arr[i];
    }
    return res;
        
    }
}