//Write a Java program to sort a numeric array and a string array.
package Array;

import java.util.Arrays;

public class W3 {
  public static void main(String[] args) {
    int[] numberArray = { 12, 2, 3, 48, 75, 487, 6697, 4827 };

    String[] stringArray = {
        "python", "java", "navaj", "oarma", "param", "manish"
    };

    System.out.println("original numberArray" + Arrays.toString(numberArray));

    // sortthe arry
    Arrays.sort(numberArray);
    System.out.println(Arrays.toString(numberArray));

    System.out.println("original stringArray" + Arrays.toString(stringArray));

    Arrays.sort(stringArray);
    System.out.println(Arrays.toString(stringArray));
  }

}
