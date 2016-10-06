/**
* This class defines a method that will perform string rotation based
* on the given params.
*/
public final class rotation
{
  public static void main(String ...args)
  {
     String text = "abcd";
     System.out.println("Original string is " + text);
     int rotLength = 2;
     try
     {
       System.out.println("Rotated string with a rotation length " + rotLength + 
	" is " + rotatestr(text,text.length(),rotLength));
     }
     catch(Exception e)
     {
       //handle it.
       System.out.print(e.getMessage());
     }
  }

  
  private static String rotatestr(String text, int length, int rotLength) 
	throws Exception //Use a generic exception.
  {
     if(text == null || rotLength > length)
     {
        throw new Exception("Invalid data");
     }

     char[] arr = text.toCharArray();

     //reverse the first part till rot length.
     reverse(arr,0,rotLength-1);
     reverse(arr,rotLength,length-1);
     reverse(arr,0,length-1); 

     //Immutable string so create a new one.
     return new String(arr); 
  }

  private static void reverse(char[] arr, int start, int end)
  {	
     while(start<end)
     {
       swap(arr,start++,end--);   
     } 
  }


  private static void swap(char[] arr, int i, int j)
  {
    char temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
