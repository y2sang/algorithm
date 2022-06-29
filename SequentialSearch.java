import java.util.stream.IntStream;

public class SequentialSearch {
    public static int search(String[] arr, String target) {
        return IntStream.range(0, arr.length).filter(index -> arr[index].equals(target)).findAny().orElse(-1);
    }

    public static void main(String[] args) {
        String[] arr = new String[]{"a", "b", "c", "d", "e", "f"};
        String target = "d";
        System.out.println(search(arr, target));
    }
}
