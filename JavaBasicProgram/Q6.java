

package JavaBasicProgram;
import java.util.*;

public class Q6 {
          public static void main(String[] args) {
                   Scanner sc = new Scanner(System.in);
                   System.out.println("enter number ");
                   int input = sc.nextInt();

                   //condition statement
                   if(input == 1){
                    System.out.println("Monday");
                   }
                   else if(input == 2){
                    System.out.println("tuesday");
                   }
                   else if(input == 3){
                    System.out.println("wensday");
                   }
                   else if(input == 4){
                    System.out.println("thrusday");
                   }
                   else if(input == 5){
                    System.out.println("Friday");
                   }
                   else if(input == 6){
                    System.out.println("saturday");
                   }
                   else if(input == 7){
                    System.out.println("sunday");
                   }
                    else if(input > 8){
                    System.out.println("invalid day");
                   }
          }
}  
