package day16_Arrays;

import java.util.Arrays;

public class C06_Soru {
    public static void main(String[] args) {
      int[] arr={12,23,12,2,3};
      Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr,6));


      // 2 3 12 12 23

    }
}
