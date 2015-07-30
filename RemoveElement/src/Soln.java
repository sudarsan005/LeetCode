
public class Soln {
	//Given an array and a value, remove all instances of that value in place and return the new length.
//	The order of elements can be changed. It doesn't matter what you leave beyond the new length.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] n = {2,7,7,4};
		Soln s = new Soln();
		System.out.print(s.removeElement(n,7));
	}
	
	public int removeElement(int[] nums, int val) {
        int i=0,j=0;
        while(j<nums.length)
        {
            if(nums[j]!=val)
            {
            nums[i]=nums[j];
            i++;}
            j++;
        }
        
        return i;
    }
}
