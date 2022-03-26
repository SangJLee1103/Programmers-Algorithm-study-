package baekjoon.sort;

//문제
//        2차원 평면 위의 점 N개가 주어진다. 좌표를 x 좌표가 증가하는 순으로, x 좌표가 같으면 y 좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 점의 개수 N (1 ≤ N ≤ 100,000)이 주어진다. 둘째 줄부터 N개의 줄에는 i번 점의 위치 xi와 yi가 주어진다.
//        (-100,000 ≤ xi, yi ≤ 100,000) 좌표는 항상 정수이고, 위치가 같은 두 점은 없다.
//
//        출력
//        첫째 줄부터 N개의 줄에 점을 정렬한 결과를 출력한다.
//
//        예제 입력 1
//        5
//        3 4
//        1 1
//        1 -1
//        2 2
//        3 3
//        예제 출력 1
//        1 -1
//        1 1
//        2 2
//        3 3
//        3 4


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q11650 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] xyArr = new int[N][2];


        for (int i = 0; i < N; i++){
            xyArr[i][0]= sc.nextInt();
            xyArr[i][1]= sc.nextInt();
        }

        Arrays.sort(xyArr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]) return o1[1] - o2[1];
                else return o1[0] - o2[0];
            }
        });

        for (int i = 0; i < N; i++){
            System.out.println(xyArr[i][0] + " " +xyArr[i][1]);
        }
    }
}
