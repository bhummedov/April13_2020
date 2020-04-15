package TwoDimArray;

import java.util.ArrayList;

public class MultiplyTwoDim {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(new ArrayList<>());
            for (int j = 0; j < 10; j++) {
                arr.get(i).add((int) (Math.random() * 100));
            }
        }
        for (ArrayList<Integer> row : arr) {
            for (int element : row) {
                System.out.print(element + "\t\t");
            }
            System.out.println();
        }
        multiplyByConstant(arr, 10);

    }

    public static void multiplyByConstant(ArrayList<ArrayList<Integer>> arr, int constant) {
        for (ArrayList<Integer> row : arr) {
            for (int value : row) {
                System.out.print(value * constant + "\t\t");
            }
            System.out.println();
        }
    }

    public static void multiplyByArrayList(ArrayList<ArrayList<Integer>> arr, int[] window) {
        int num;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j += 2) {
                num = arr.get(i).get(j) * window[0];
                arr.get(i).set(j, num);
                num = arr.get(i).get(j + 1) * window[1];
                arr.get(i).set(j + 1, num);
            }
        }
    }
}
