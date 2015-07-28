
public class Soln {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {1,2,3,4,5,6,7};
		Soln s = new Soln();
		s.rotate(num,3);
		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
		}
		

	}
	public void rotate(int[] nums, int k) 
    {
           
        if(k > nums.length) 
        k=k%nums.length;
        int j=0;
        int[] temp=new int[nums.length];
    
    if(k>0 || nums.length!=k)
    {
        for(int i=0;i<k;i++)
        {
           temp[i]=nums[nums.length-k+i];
            
    
        }
        
        for (int i=k;i<nums.length;i++)
        {
            temp[i]=nums[j];
            j++;
        }
        
    
            System.arraycopy( temp, 0, nums, 0, nums.length );    
    
            
                 
        }
    }
}
