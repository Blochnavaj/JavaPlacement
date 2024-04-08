package GEEKFORGEEK;

import java.util.Scanner;
import java.util.Arrays;
import java.math.*;

public class E2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();

    // make array
    int[] my_Array = new int[size];

    // input
    for (int i = 0; i < size; i++) {
      my_Array[i] = sc.nextInt();
    }

    Arrays.sort(my_Array);

    // output

    System.out.println(" min " + my_Array[0] + " max " + my_Array[my_Array.length - 1]);

  }
}
