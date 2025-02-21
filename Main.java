import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    ArrayList<String> stringList = new ArrayList<String>();
    ArrayList<Integer> numList = new ArrayList<Integer>();
    numList.add(10);
    numList.add(-24);
    numList.add(11);
    numList.add(-82);
    numList.add(-73);
    numList.add(99);
    numList.add(55);
    numList.add(44);
    numList.add(3);
    Scanner sc = new Scanner(System.in);
    String input = "";

    System.out.println("Please enter words, enter STOP to stop the loop.");
    while (!input.equals("STOP"))
    {
      input = sc.nextLine();
      stringList.add(input);
    }

    stringList.remove("STOP");
    System.out.println();
    inputWords(stringList);
    System.out.println(highestNum(numList));
    System.out.println(getEvens(numList));
  }

  public static void inputWords(ArrayList<String> words) {
    System.out.println(words);
    for (int i = 0; i < words.size(); i++) {
      System.out.println(words.get(words.size() - i - 1) + words.get(i));
    }

  }

  // Problem 2 - HighestNum
  public static Integer highestNum(ArrayList<Integer> arr)
  {
    Integer num = arr.get(0);
    for (Integer i : arr) {
      if (i.intValue() > num.intValue()) {
        num = i;
      }
    }
    return num;
  }

  // Problem 3 - getEvens
  public static ArrayList<Integer> getEvens(final ArrayList<Integer> arr)
  {
    ArrayList<Integer> evens = new ArrayList<Integer>();
    for (int i = 0; i < arr.size(); i++) {
      if (arr.get(i).intValue() % 2 == 0) {
        evens.add(arr.get(i));
      }
    }
    return evens;
  }
}
