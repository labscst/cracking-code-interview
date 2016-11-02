import java.util.*;

public class pattern
{
 public static void main(String ...args)
 {
   //Input:
   //s: "cbaebabacd" p: "abc"
   //Output:
   //[0, 6]
   String s = "cbaebabacd";
   String p = "abc"; 
   findAnagramps(s,p);

   s = "abab";
   p = "ab";
   findAnagramps(s,p);
 }


 static void findAnagramps(String s,String p)
 {
  List<Integer> list = new ArrayList<Integer>();
  //get the hash of the pattern.
  int patternHash = makeHash(p,0,p.length());
  int hash;
  for(int i =0;i<s.length()-p.length()+1;i++)
  { 
     hash = makeHash(s,i,p.length());
     if(hash==patternHash) //do string comparison to make sure.
     {
       list.add(i);
     }
  }
  System.out.println(list);
 }

 //This method doesn't do rolling hash so it is 
 //o(mn) but it could be enhanced with rolling
 //hash to do o(m+n)
 static int makeHash(String s, int start, int end)
 {
   int sum = 0;
   for(int i=start; i<start+end;i++)
   {
    sum+=s.charAt(i);
   } 
    
   return sum%97;
 }

}
