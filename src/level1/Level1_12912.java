package level1;

import java.util.stream.LongStream;

public class Level1_12912 {
    public static void main(String[] args) {
        int a = 5, b = 3;

        long answer = 0;
        if(a <= b) answer = LongStream.range(a, b+1).sum();
        else answer = LongStream.range(b, a+1).sum();

        System.out.println("answer = " + answer);

    }
}
