
public class Soln {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "A man, a plan, a canal: Panama";
		Soln s = new Soln();
		System.out.print(s.isPalindrome(str));
	}
	public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-i-1))
            return false;
        }
        return true;
        
    }
}
