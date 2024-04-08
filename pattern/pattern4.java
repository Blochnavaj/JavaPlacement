  // print the pattern inverted half pyramid 
package pattern;

public record pattern4() {
           public static void main(String[] args) {
               int m = 4;

               for(int i =m; i >=1; i--){
                for(int j =1; j <=i; j++ ){
                  System.out.print("*");
                }
                System.out.println();
               }
           }
}
