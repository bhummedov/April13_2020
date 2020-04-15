package TwoDimArray;

import java.util.ArrayList;
import java.util.Arrays;

public class LinkedistArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int max;
        if (arr.get(0)>arr.get(arr.size()-1)){
            max= arr.get(0);
        }
        else{
            max =arr.get(arr.size()-1);
        }
        for (int i=0; i< arr.size(); i++){
            arr.set(i,max);
        }
        System.out.println(arr);
    }
}
