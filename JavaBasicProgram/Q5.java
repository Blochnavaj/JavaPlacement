package JavaBasicProgram;

import java.util.Scanner;

public class Q5 {
       // write the function
       public static void printTable(int n){
        for(int i = 1; i<=10; i++){
         System.out.println(i * n);
        
        }
     }
  public static void main(String[] args) {
          //input user 
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the table number");
            int n = sc.nextInt();
            // call the function
            printTable(n);
  }
}
        

