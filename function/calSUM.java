package function;

import java.util.Scanner;

public class calSUM {
  public static int  numberSum(int a, int b){
    int sum = a + b;
   System.out.println(sum);
   return sum;
  }

  
  public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = numberSum(a, b);// call the function 

     }
}