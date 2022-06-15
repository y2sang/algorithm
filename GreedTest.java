public class GreedTest {
    public static void main(String[] args) {
        int n = 1260;
        int count = 0;

        Integer[] coinTypes = {500, 100, 50, 10};
        for (Integer coin : coinTypes) {
            count += n / coin;
            System.out.println("count::"+count);
            n %= coin;
            System.out.println("N::"+n);
        }
        System.out.println(count);

    }

}
