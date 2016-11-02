import java.util.*;

public class findSum
{
  public static void main(String ...args)
  {
    int[] arr = {1,2,4,3};
    findPairs(arr,5);
  }

  //Finds the pairs in O(nlogn) complexity.
  static void findPairs(int[] arr, int sum)
  {
    //Sort the array: O(nlogn).
    Arrays.sort(arr);
    
    //Do a binary search for the paired value for each one.
    //The time complexity is O(nlogn). 
    for(int i=0;i<arr.length;i++)
    {
      int pair = sum-arr[i];
      if(pair>=0 && Arrays.binarySearch(arr,i,arr.length,pair)>0)
      {
        System.out.println("Matched pairs are " + arr[i] + " and " + pair);  
      }
    } 
  }

}
