package baekjoon.greedy;

//문제
//        서로 다른 N개의 자연수의 합이 S라고 한다. S를 알 때, 자연수 N의 최댓값은 얼마일까?
//
//        입력
//        첫째 줄에 자연수 S(1 ≤ S ≤ 4,294,967,295)가 주어진다.
//
//        출력
//        첫째 줄에 자연수 N의 최댓값을 출력한다.
//
//        예제 입력 1
//        200
//        예제 출력 1
//        19


import java.util.Scanner;

public class Q1789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long S = sc.nextLong();
        long sum=0;
        int count = 0;


        for (int i=1; ; i++){
            if(S < sum) break;
            sum+=i;
            count++;
        }
        System.out.println(count-1);
    }
}
