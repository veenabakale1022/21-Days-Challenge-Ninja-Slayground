public class Solution {
    public static int sumFirstN(int n) {
        int sum=0;
        int t=1;

        while(n != 0){
            sum += t;
            t++;
            n--;
        }
        return sum;
    }
}
