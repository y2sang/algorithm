import java.util.Arrays;
import java.util.Scanner;

public class GreedTest2 {
    public static void main(String[] args) {


        int[] arr = {5, 8, 3};
        int[] arr2 = {2, 4, 5, 4, 6};
//        int[] arr2 = {3, 4, 3, 4, 3};
        Arrays.sort(arr2);

        for (int item : arr2) {
//            System.out.println(item);
        }

        int largestNumber = arr2[arr2.length - 1];
        int secondLargestNumber = arr2[arr2.length - 2];
        int n = arr[0];
        int m = arr[1];
        int k = arr[2];

        System.out.println(largestNumber);
        System.out.println(secondLargestNumber);
        int result = 0;
        int cnt = 0;
        while (true) {
            System.out.println("LOOP::" + cnt++);
            for (int i = 1; i < k; i++) {
                if (m == 0) break;
                result += largestNumber;
                System.out.println(m + "::" + result);
                m--;

            }
            if (m == 0) break;
            result += secondLargestNumber;
            System.out.println(m + "::" + result);
            m--;

        }
        System.out.println(result);


    }

}
