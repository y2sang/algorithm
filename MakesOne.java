import java.util.Arrays;

public class MakesOne {
    public static void main(String[] args) {


        int[] arr = {25, 3};
        int n = arr[0];
        int k = arr[1];
        int cnt = 0;
        while (n >= k) {

            System.out.println("n%k:: " + n % k);
            while (true) {
                if (n % k != 0) {
                    n--;
                    System.out.println("cnt :: " + cnt++);
                    System.out.println("wn::" + n);
                } else {
                    break;
                }
            }
            System.out.println("n::" + n);
            n = n / k;

            cnt++;


        }

        while (n > 1) {
            n--;
            cnt++;

        }
        System.out.println("RESULT::" + cnt);

    }

}
