import java.util.ArrayList;
public class Solution {
	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		// Write your code here.
		if (n <= 1) {
            return n;
        }
        
        int index = 1;

        for (int i = 1; i < n; i++) {
            if (!arr.get(i).equals(arr.get(i - 1))) {
                arr.set(index, arr.get(i));
                index++;
            }
        }
        
        return index
		
		or

		// if (n == 0) {
        //     return 0;
        // }

        // int newIndex = 0; 

        // for (int i = 1; i < n; i++) {
        //     if (!arr.get(newIndex).equals(arr.get(i))) {
        //         newIndex++;
        //         arr.set(newIndex, arr.get(i));
        //     }
        // }

        // return newIndex + 1;
	}
}
