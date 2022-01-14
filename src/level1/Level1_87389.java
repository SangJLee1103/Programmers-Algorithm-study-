package level1;

import java.util.stream.IntStream;

public class Level1_87389 {
    public static void main(String[] args) {
        int n = 10;
        int answer = 0;

        int[] arr =IntStream.range(1, n).filter(x-> n % x == 1).toArray();
        answer = arr[0];
    }
}
