package level1;

import java.util.stream.LongStream;

public class Level1_82612 {
    public static void main(String[] args) {
        int price = 3, money = 20, count =4;

        long answer = LongStream.range(1, count+1).mapToInt(x-> (int) (x * price)).asLongStream().sum();
        if(money > answer) answer = 0;
        else answer -= money;
        System.out.println("answer = " + answer);
        
    }
}
