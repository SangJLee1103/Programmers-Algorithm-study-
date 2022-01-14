package level1;

import java.util.Arrays;

public class Level1_12910 {
    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;

        int[] answer = Arrays.stream(arr).filter(i-> i % divisor == 0).sorted().toArray();
        
        for (int i:answer){
            System.out.println("i = " + i);
        }
    }
}
