package level1;


import java.util.Arrays;
import java.util.Collections;

public class Level1_12982 {
    public static void main(String[] args) {
        int[] d = {2,2,3,3};
        int budget = 10;
        int answer = 0;

        Arrays.sort(d);
        int sum = 0;
        for (int i=0; i<d.length; i++){
            if(budget > sum){
                sum += d[i];
                answer++;
            }
        }

        if(sum > budget){
            answer-=1;
        }

        System.out.println(answer);
    }
}
