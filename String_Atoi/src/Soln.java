//Implement atoi to convert a string to an integer.
public class Soln {

	public int myAtoi(String str) {
        
		str=str.trim();
        if (str == null)
		{
        	return 0;
		}
        
		
        int i=0;
        int res=0;
        char sign_flag='+';
        if(str.charAt(0)=='-')
           { sign_flag='-';
            i++;}
            
        else if(str.charAt(0)=='+')
           {  i++;}
           
        System.out.println("i");
        
        
       while(i < str.length()  && str.charAt(i) >='0' && str.charAt(i) <='9')
       
        {
    	   
            res=res * 10 + (str.charAt(i) - 48);
            ++i;
           
        }
        if(sign_flag=='-')
            res=-res;
        if (res > Integer.MAX_VALUE)
    		return Integer.MAX_VALUE;
    		
     
    	    if (res < Integer.MIN_VALUE)
    		return Integer.MIN_VALUE;
        return (int)res;
        
    
   //-------------------------------------------------------------------------------     
       /* if (str == null) return 0;
        int i = 0;
        boolean sign = true;
        str = str.trim();
        int n = str.length();
        if (i < n && (str.charAt(0) == '+' || str.charAt(0) == '-')) {
            if (str.charAt(0) == '+') sign = true;
            else sign = false;
            ++i;
        }
        int res = 0;
        while (i < n && Character.isDigit(str.charAt(i))) {
           if(res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > Integer.MAX_VALUE % 10)){
            return sign ? Integer.MAX_VALUE : Integer.MIN_VALUE ;
            }
            res = res * 10 + str.charAt(i) - 48;
            ++i;
        }
        return sign ? res : -res; */
  //----------------------------------------------------------------------------------     
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Soln s = new Soln();
		int i=2;
				System.out.println(String.valueOf(i));
		System.out.println(s.myAtoi("    010"));

	}
}
