/*Find Peak Element
A peak element is an element that is greater than its neighbors.

Given an input array where num[i] ≠ num[i+1], find a peak element and return its index.

The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.

You may imagine that num[-1] = num[n] = -∞.

For example, in array [1, 2, 3, 1], 3 is a peak element and your function should return the index number 2.*/

public class Solution {
    public int findPeakElement(int[] num) {
        /*int max=Integer.MIN_VALUE,t_max=Integer.MIN_VALUE,res=0;
        for(int i =0 ; i< nums.length-1;i++)
        {
            if(nums[i]!=nums[i+1])
            {
                t_max=Math.max(nums[i],nums[i+1]);
                //System.out.println(t_max);
                max=Math.max(t_max,max);
                if(max==nums[i])
                    res=i;
                else if(max==nums[i+1])
                    res=i+1;
            }
        }
        return res;*/
        
        return helper(num,0,num.length-1);
}

public int helper(int[] num,int start,int end)
{
    if(start == end){
        return start;
    }else if(start+1 == end){
        if(num[start] > num[end]) return start;
        return end;
    }else{

        int m = (start+end)/2;

        if(num[m] > num[m-1] && num[m] > num[m+1]){

            return m;

        }else if(num[m-1] > num[m] && num[m] > num[m+1]){

            return helper(num,start,m-1);

        }else{

            return helper(num,m+1,end);

        }

    }
    }
}