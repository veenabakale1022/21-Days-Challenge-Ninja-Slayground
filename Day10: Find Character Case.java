import java.util.* ;
import java.io.*; 
public class Solution {
    public static int findCase(char ch) {
        // Write your code here.
        if(ch >= 97 && ch <= 122){
            return 0;

        }else if(ch >=65 && ch <= 90){
            return 1;
        }
        else{
            return -1;
        }
    }
}
