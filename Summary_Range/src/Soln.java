import java.util.List;
import java.util.ArrayList;
public class Soln {

	//For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
	
public List<String> summaryRanges(int[] nums) {
    List<String> res = new ArrayList<String>(); 
	
	int[] a= {};
	System.out.println(nums.length);
     
     if(nums.length==0 || nums==null)
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
     

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [] n = {0,1,2,4,5,7};
		int [] n = {};
		Soln s = new Soln();
		System.out.println(s.summaryRanges(n));
	}

}
