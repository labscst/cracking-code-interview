public class largestsum
{
  public static void main(String ...args)
  {
    int[] arr = {2,-8,3,-2,4,-10};
    int maxsum = iterativeSum(arr);
    System.out.println("Max sum is " + maxsum); 

  }



  /**
   * Finds the largest sum of a subsequence iteratively.
   */
  static int iterativeSum(int[] arr)
  {
    //TODO: error checks.
    int max = Integer.MIN_VALUE;
    int currentMax = 0;

    for(int x : arr)
    {
      currentMax += x;
      if(currentMax<0)
      {
       //reset the current max.
       currentMax = 0;
       continue;
      } 

      if(currentMax > max)
      {
        max = currentMax;
      }
    }
    
    return max;

  }

}
