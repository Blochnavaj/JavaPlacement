
// print the pattern solid rectangle 
package pattern;

public class pattern1 {
       public static void main(String[] args) {

            int n = 4;
            int m = 5;

            // outer loop 
            for(int i = 1; i <= n; i++ ){
              // inner loop
               for(int j = 1; j <= m; j++ ){
                System.err.print("*");
               }
               System.err.println();
            }


        }
          
} 
