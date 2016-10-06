/**
* This class implements an algorithm that will change a word
* to the count of the unique letters between first and last
* letters. Such as, "apple" should change to "a4e". */

public class countletters
{

 public static void main(String ...args)
 {
  String s = "apple";
  System.out.println("The new string is " + count(s));
 }
 

 static String count(String str)
 {
   //Check the conditions where str is null etc.
   if(str == null)
   {
     return null;
   }
   
   //Only ASCII letters have been confirmed.  
   boolean[] bitArray = new boolean[26];
   for(int i= 0; i< bitArray.length; i++)
   {
    bitArray[i] = false; 
   }

   char[] arr = str.toCharArray();
   StringBuilder builder = new StringBuilder();
   builder.append(arr[0]);
   int uniqLetters = 0;
   
   for(char c : arr)
   {
     if (c >= 'A' && c <= 'Z')
     {
       //Use lowercase.
       c = (char) (c + 32) ;
     } 

     if(!bitArray[c-'a'])
     {
       uniqLetters++;
       bitArray[c-'a'] = true;  
     }
   }
   builder.append(uniqLetters);
   builder.append(arr[arr.length-1]); 

   return builder.toString();
 }
} 


