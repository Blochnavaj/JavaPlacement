package function;

import java.util.Scanner;

public class calMUL {
           public static int  multiply(int a, int b){
               int mul = a * b;
               System.out.println(mul);
               return mul;
           }
       public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int b = sc.nextInt();
         int mul = multiply(a, b); //call the function 
          
        
       

       }
}
