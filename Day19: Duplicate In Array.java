import java.util.ArrayList;
import java.util.TreeSet;

public class Solution {

	public static int findDuplicate(ArrayList<Integer> arr) {

	
		TreeSet<Integer> seen = new TreeSet<>();

		for(int num : arr){
			if(seen.contains(num)){
				return num;
			}
			seen.add(num);
		}
		return -1;

	}
}
