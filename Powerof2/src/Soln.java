//Given an integer, write a function to determine if it is a power of two.

public class Soln {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		Soln s = new Soln();
		s.isPowerOfTwo(n);
		
		
		 
		///if(n<=0) 
	 ////       return false;
	}
	public boolean isPowerOfTwo(int n) {
        if(n==1 ) return true;
        if(n>1  )
        {
            int t=n-1;
            int res=n&t;
            if(res==0)
            return true;
        }
        return false;
        
        
    }

}
