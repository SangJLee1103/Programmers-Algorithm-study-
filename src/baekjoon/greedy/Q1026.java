package baekjoon.greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Q1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int answer = 0;
        int N= sc.nextInt();
        int[] A = new int[N];
        Integer[] B = new Integer[N];


        for (int i = 0; i< A.length; i++){
            A[i] = sc.nextInt();
        }

        for (int i = 0; i< B.length; i++){
            B[i] = sc.nextInt();
        }

        Arrays.sort(A);
        Arrays.sort(B, Collections.reverseOrder());

        for (int i=0; i < N; i++){
            answer += (A[i] * B[i]);
        }

        System.out.println(answer);
    }
}
