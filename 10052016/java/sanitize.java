import java.util.*;


/**

To run this class:

java sanitize
1 2 3 3 4 4
3 2 3 4 5
-1

*/

public class sanitize
{

 public static void main(String ...args)
 {
  Scanner scanner = new Scanner(System.in);
  List<String> list = new ArrayList<String>();

  
  while(scanner.hasNext())
  {
   String s = scanner.nextLine();
   if(s.equals("-1")) //Use -1 to end this.
   {
    //we are done.
    break;
   }
   //Get the string.
   list.add(s);
  }

  //close the scanner. 
  scanner.close();

  for(String s : list)
  {
   //Sort.
   s = sort(s);
   //Sorting will get the space before because
   //ascii of space is less.
   //ex."1 2 3 3 4" will become "     12334"
   //option is to write a custom sort.

   //Get rid of duplicates.
   s = removeDups(s);

   //Print it.
   System.out.println(s);
  }
 
 }


 
 static String sort(String s)
 {
   char[] arr = s.toCharArray();
   Arrays.sort(arr);
   return new String(arr);
 }

 static String removeDups(String s)
 {
  StringBuilder builder = new StringBuilder();
  char[] arr = s.toCharArray();
  int count = 0;
  //read all spaces.
  while(arr[count++]==' ');

  count = count -1 ; 
  
  char lastChar = arr[count++];
  builder.append(lastChar);
  builder.append(' ');

  
  for(int i = count;i<s.length();i++)
  {
   if(arr[i] == lastChar)
   {
    continue;
   } 

   lastChar = arr[i];
   builder.append(lastChar);
   if(i<s.length()-1)
   {
     builder.append(' ');
   } 
  } 

  return builder.toString();
 }

}
