package String;

import java.util.*;

import java.util.Scanner;

public class Strinng {
  public static void main(String[] args) {
    // string declaration
    // String name = "navaj";
    // String fullname = "navaj bloch";
    // String sentences = "my name is navaj bloch.";

    // user input as string
    // Scanner sc = new Scanner(System.in);
    // String name = sc.next();
    // System.out.println("your name is : " + name);

    // // concatenation
    // String Firstname = "navaj";
    // String Lastname = "bloch";
    // String Fullname = Firstname + " " + Lastname;
    // System.out.println(Fullname.length());

    // // charArt
    // for (int i = 0; i < Fullname.length(); i++) {
    // System.out.println(Fullname.charAt(i));
    // }

    // compare
    // String name1 = "tony";
    // String name2 = "tony";

    // if (name1.compareTo(name2) == 0) {
    // System.out.println("Strisng are equal");
    // } else {
    // System.out.println("string are not equal ");
    // }

    // sub string in java
    String sentence = "my name is navaj bloch";
    String name = sentence.substring(11, sentence.length());
    System.out.println(name);

  }
}
