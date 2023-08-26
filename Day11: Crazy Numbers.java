import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static ArrayList<ArrayList<Integer>> numberPattern(int n) {

		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		int a = 1;
		for(int i=1;i<=n;i++){
			ArrayList<Integer> row = new ArrayList<>();
			for(int k=1;k<=n-i;k++){
				row.add(-1);
			}
			for(int j=1;j<=i;j++){
				if(a==10){
					a=1;
				}
				row.add(a);
				a++;
			}
			list.add(row);
		}
		return list;
	}
}
