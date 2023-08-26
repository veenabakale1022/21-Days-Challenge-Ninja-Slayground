import java.util.*;
public class Main {
  public static boolean chechArmstrong(int n,int len){
    int num = n;
    int sum = 0;
    while(n!=0){
      sum += Math.pow(n%10,len);
      n /= 10;
    }
    return sum == num;
  }
  public static void main(String[] args) {
    // Write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int len = n;
    int count = 0;
    while(len!=0){
      count++;
      len /= 10;
    }
    System.out.print(chechArmstrong(n,count));
  }
}
