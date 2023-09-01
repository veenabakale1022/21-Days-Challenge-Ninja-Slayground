import java.util.* ;
import java.io.*; 
public class Solution {
  public static int sumOfMaxMin(int[] arr, int n) {
      
      if(n == 0){
        return 0;
      }
      int max =arr[0];
      int min =arr[0];

      for(int i=1;i<n;i++){
        if(arr[i]>max){
          max = arr[i];
        }
        if(arr[i]<min){
          min = arr[i];
        }
      }
      return max+min;
  }
}
