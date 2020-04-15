package TwoDimArray;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class StringArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> arr = new ArrayList<>();
        ArrayList<String> arr1 = new ArrayList<>(Arrays.asList("Java", "is", "fun"));
        arr.add(arr1);
        ArrayList<String> arr2 = new ArrayList<>(Arrays.asList("Java", "is", "super"));
        arr.add(arr2);
        System.out.println(arr);
        findUpperCases(arr);
        lowerCase(arr);
        findUpperLetter(arr);
    }
    public static void findUpperCases(ArrayList<ArrayList<String>> word) {
        int counterWord;
        int counterRow;
        for (int i = 0; i < word.size(); i++) {
            counterRow = 0;
            for (int j = 0; j < word.get(i).size(); j++) {
                counterWord = 0;
                for (int k = 0; k < word.get(i).get(j).length(); k++) {
                    if (Character.isUpperCase(word.get(i).get(j).charAt(k))) {
                        counterWord++;
                    }
                }
                counterRow += counterWord;
            }
            System.out.println("There are " + counterRow + "\t upper cases at" + (i + 1));
        }
        System.out.println("------------------------------------------");
    }
    public static void lowerCase(ArrayList<ArrayList<String>> word) {
        int counterWord;
        int counterRow;
        for (int i = 0; i < word.size(); i++) {
            counterRow = 0;
            for (int j = 0; j < word.get(i).size(); j++) {
                counterWord = 0;
                for (int k = 0; k < word.get(i).get(j).length(); k++) {
                    if (Character.isLowerCase((word.get(i).get(j).charAt(k)))) {
                        counterWord++;
                    }
                }
                counterRow += counterWord;
            }
            System.out.println("There are " + counterRow + "\t lower cases at" + (i + 1));
        }
        System.out.println("------------------------------------------");
    }
    public static void findUpperLetter(ArrayList<ArrayList<String>> word) {
        int counterWord;
        for (int i = 0; i < word.size(); i++) {
            for (int j = 0; j < word.get(i).size(); j++) {
                counterWord = 0;
                for (int k = 0; k < word.get(i).get(j).length(); k++) {
                    if (Character.isUpperCase(word.get(i).get(j).charAt(k))) {
                        counterWord++;
                    }
                }
                System.out.println("There are " + counterWord + "\t lower cases in every word " + word.get(i).get(j));
            }
        }
    }
}



