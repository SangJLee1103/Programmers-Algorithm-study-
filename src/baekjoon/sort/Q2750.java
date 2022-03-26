package baekjoon.sort;

import java.util.Arrays;
import java.util.Scanner;

public class Q2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i =0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println(arr[0]);
        for (int i =1; i < N; i++){
            if(arr[i-1] == arr[i]) continue;
            else System.out.println(arr[i]);
        }
    }
}
