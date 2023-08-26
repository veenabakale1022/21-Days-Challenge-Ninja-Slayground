public class Solution {
    public static int[] printNos(int x) {
        int[] arr = new int[x];
        oneton(arr,x,0);
        return arr;
    }
    public static void oneton(int[] arr, int x, int i){
        if(i>=x) return;
        arr[i]=i+1;
        oneton(arr,x,i+1);
    }
}
