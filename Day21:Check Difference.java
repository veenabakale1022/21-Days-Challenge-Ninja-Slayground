import java.util.* ;
import java.io.*; 
import java.util.HashSet;
public class Solution 
{
	public static boolean checkDiff(int[] arr, int N, int K) 
    {
		// WRITE YOUR CODE HERE
		 HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            
            int neededValue1 = arr[i] + K;
            int neededValue2 = arr[i] - K;

            
            if (set.contains(neededValue1) || set.contains(neededValue2)) {
                return true;
            }

            
            set.add(arr[i]);
        }

        
        return false;

	}
}
