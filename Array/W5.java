// 2D ARRAY IN JAVA
package Array;

import java.util.Scanner;

public class W5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int cols = sc.nextInt();

    int[][] my_Array = new int[rows][cols];

    // input
    // outer loop control rows
    for (int i = 0; i < rows; i++) {
      // inner loop control columns
      for (int j = 0; j < cols; j++) {
        my_Array[i][j] = sc.nextInt();
      }

    }

    // oytput

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.print(my_Array[i][j] + " ");
      }
      System.out.println();
    }
  }
}
