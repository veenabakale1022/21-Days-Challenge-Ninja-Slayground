import java.util.* ;
import java.io.*; 

public class Solution {

	public static List<List<Integer>> fahrenheitToCelsius(int s, int e, int w) {
		// Write your code here
		List<List<Integer>> list = new ArrayList<>();

		while (s <= e) {
        int c = (int) ((s - 32) * 5.0 / 9.0);  
        List<Integer> temp = new ArrayList<>(); 
        temp.add(s);
        temp.add(c);
        list.add(temp);
        s = s + w;
		}
		return list;

	}

}
