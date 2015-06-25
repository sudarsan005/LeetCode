
import java.io.*;
import java.util.HashMap;
public class Solution {
//time complexity O(n) + O(logn)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,2,2,8,1,4,4,11,4,4,85,33,33};
		   System.out.println(getKthMostFrequent(a));
	}
	public static int getKthMostFrequent(int arr[])
	{
		int maxCount=0, freq=-1;
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		
		for(int i=0; i < arr.length; i++)
		{
			// add the first value to hash
			if(map.get(arr[i])==null)
			map.put(arr[i], 1);
			else { // increment the count if does not exist
				int count = map.get(arr[i])+1;
				map.put(arr[i],count);
				if(count > maxCount)
				{
					maxCount=count;
					freq=arr[i];
				}
					
			}
		}
		//if all values are distinct
		if(freq==-1 && arr.length>0)
			return arr[0];
		//else return freq element
		return freq;
		
	}

}
