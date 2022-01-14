package level1;

import java.util.Arrays;

public class Level1_86051 {
    public static void main(String[] args) {
        int[] numbers = {5,8,4,0,6,7,9};

        int answer = 45 - Arrays.stream(numbers).sum();

    }
}
