package level1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Level1_12928 {
    public static void main(String[] args) {
        int n = 12;

        int answer = IntStream.range(1, n + 1).filter(m -> n % m == 0).sum();
        System.out.println("answer = " + answer);

    }
}
