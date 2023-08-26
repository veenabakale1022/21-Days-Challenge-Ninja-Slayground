import java.util.* ;
import java.io.*; 
public class Solution {
	public static int[] termsOfAP(int x){
		// Write your code here.
		int[] series = new int[x];
		int count = 0;
		int n=1;

		while(count < x){
			int term = 3*n+2;
			if(term %4 != 0){
				series[count]=term;
				count++;
			}
			n++;
		}
		return series;

	}
}
