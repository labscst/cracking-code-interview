public class findAnagram {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() !=t.length())
        {
            return false;
        }
        
        int[] arr = new int[26];
        
        for(char c : s.toCharArray())
        {
            arr[c-'a']++;
        }
        
        for(char c : t.toCharArray())
        {
            int count = arr[c-'a'];
            if(count<=0)
            {
                return false;
            }
            arr[c-'a']--;
        }
        
        return true;
        
    }
}
