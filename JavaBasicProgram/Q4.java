package JavaBasicProgram;

import java.util.Scanner;

public class Q4 {
             //  write the function 
             public static void evenNumber(int n ){
               if(n % 2 == 0){
                System.out.println(n  + " number is even");
               }else{
                System.out.println(n + " number is not even");
               }
           }
          

    public static void main(String[] args) {
            //input the user 
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number");
            int n = sc.nextInt();
           // call the function
            evenNumber(n);

          
          }  


}
