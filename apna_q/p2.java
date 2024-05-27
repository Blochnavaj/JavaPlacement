package apna_q;

import java.util.Scanner;

public class p2 {
  public static void main(String[] args) {

    // scanner class
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();

    // make array

    int[] number = new int[size];

    // input array
    for (int i = 0; i < size; i++) {
      number[i] = sc.nextInt();
    }

    // output array
    for (int i = 0; i < size; i++) {
      System.out.println(number[i]);
    }

  }
}
