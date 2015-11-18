/*Summary Ranges
Given a sorted integer array without duplicates, return the summary of its ranges.

For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
*/

public class Solution {
    public List<String> summaryRanges(int[] nums) 
    {
            /*List<String> res = new ArrayList<String>(); 
    //List<String> res= ne ArrayList<String>>();
	int prev=nums[0];
	int fst=prev;
	for ( int i=1; i< nums.length;i++)
	{
	    if(nums[i]==prev+1)
	    {
	        if(i==nums.length-1)
	        {
	         res.add(fst+"->"+nums[i]);
	        }
	        else 
	        {
	        if(nums[i]==prev)
	        {
	            res.add(nums[i]+"");
	        }
	        else if (nums[i]==prev+1)
	        {
	            res.add(nums[i]+"");
	        }
	        }
	        fst = nums[i];
	    }
	    prev=nums[i];
	}
        
        return res; */
    List<String> res = new ArrayList<String>(); 

     if(nums.length==0 || nums == null)
     {
    	 return res;
     }
     if(nums.length==1)
     {
    	 res.add(nums[0]+"");
     }
     	int prev=nums[0];
	int fst=prev;
     
     for ( int i=1; i< nums.length;i++)
 	{
 	    if(nums[i]==prev+1)
 	    {
 	        if(i==nums.length-1)
 	        {
 	         res.add(fst+"->"+nums[i]);
 	        }
 	    }
 	        else 
 	        {
 	        	if(fst==prev)
 	        	{
 	        		res.add(fst+"");
 	        	}
 	        	else
 	        	{
 	        	res.add(fst +"->" + prev );
 	        	}
 	        
 	        if (i==nums.length-1)
 	        {
 	            res.add(nums[i]+"");
 	        }
 	        fst = nums[i];
 	        }
 	        
 	    prev=nums[i];
 	}
         
         return res;
     }
    }