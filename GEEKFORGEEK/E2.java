//Program to find the minimum (or maximum) element of an array take array in user input 
package GEEKFORGEEK;

import java.util.*;

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

    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    // output
    for (int i = 0; i < my_Array.length; i++) {
      if (my_Array[i] < min) {
        min = my_Array[i];
      }
      if (my_Array[i] > max) {
        max = my_Array[i];
      }
    }
    System.out.println("the largest values of" + max);
    System.out.println("the smallest values of" + min);

  }
}
