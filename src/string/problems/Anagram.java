package string.problems;

import java.util.Arrays;

public class Anagram {


    static boolean anagramTest(char[] str1, char[] str2) {

        //Finding the length of the two words because
        // they must be the same length to be an anagram
        int ele1 = str1.length;
        int ele2 = str2.length;


        if (ele1 != ele2)
            return false;
        //Sorting the words will help compare
        //the letters to one another more easily
        Arrays.sort(str1);
        Arrays.sort(str2);

        for (int i = 0; i < ele1;i++)
            if (str1[i] != str2[i])
                return false;
        return true;
    }

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        String word1 = "CAT";
        String word2 = "ACT";


        char [] str1 = word1.toCharArray();
        char [] str2 = word2.toCharArray();


        if (anagramTest(str1, str2))
            System.out.println("Anagram boi!");
        else
            System.out.println("Not an Anagram fool");
    }
}