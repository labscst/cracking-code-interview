//This class describes how to find all combinations of a string.
public final class combination
{
   public static void main(String ...args)
   {
     String s = "abc";
     boolean[] truthTable = new boolean[26];
     //Generate and print all combinations. 
     //You can also use a list to write all strings 
     //to the list.
     
     //FIXME: validate s.
     generateCombination(s, new StringBuilder(),truthTable);
   }

   
   static void generateCombination(String s, StringBuilder builder,boolean[] truthTable)
   {
     //Form the exit condition first; exit and print when the string builder is
     //large enough as the string.
     if(builder.length() == s.length())
     {
	System.out.println(builder.toString());
     } 


     for(int i =0 ; i< s.length() ; i++)
     {
       char c = s.charAt(i);
       if(truthTable[c-'a'])
       {
         //we have seen it before.
         continue;
       }

       builder.append(c);
       truthTable[c-'a'] = true;

       generateCombination(s, builder,truthTable);

       builder.setLength(builder.length()-1);
       
       truthTable[c-'a'] = false;
     }

   }

}
