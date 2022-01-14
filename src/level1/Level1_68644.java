package level1;

import java.util.*;

public class Level1_68644 {
    public static void main(String[] args) {
        int[] numbers = {2,1,3,4,1};

        TreeSet<Integer>set = new TreeSet<>();

        for(int i=0; i < numbers.length-1; i++){
            for (int j=i+1; j < numbers.length; j++){
                set.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = set.stream().sorted().mapToInt(Integer::intValue).toArray();

    }
}
