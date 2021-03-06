import java.util.HashMap;

/*
 * Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

For example,
Given "egg", "add", return true.

Given "foo", "bar", return false.

Given "paper", "title", return true.
 */
public class Soln {

	public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
        {
        return false;
        }
        if(s.length()==0) return true;
        
        
        HashMap <Character,Character> map = new HashMap<Character,Character>();
        HashMap <Character,Character> map2 = new HashMap<Character,Character>();
        for(int i=0;i<s.length();i++)
        {
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(map.containsKey(c1))
            {
              if(map.get(c1)!=c2)
                return false;
            }
            if(map2.containsKey(c2)){
				if(map2.get(c2)!=c1) return false;
			}
            
            map.put(c1,c2);
            map2.put(c2,c1);
            
        }
        return true;
        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Soln s = new Soln();
		System.out.println(s.isIsomorphic("aa","ba"));

	}

}
