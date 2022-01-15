package level1;

import java.util.ArrayList;
import java.util.Collections;


//자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
//
//        제한 조건
//        n은 10,000,000,000이하인 자연수입니다.
//        입출력 예
//        n	return
//        12345	[5,4,3,2,1]


public class Level1_12932 {
    public static void main(String[] args) {
        long n = 12345;

        String num = Long.toString(n);
        ArrayList<Character>arrayList = new ArrayList<>();

        for (int i=0; i< num.length(); i++){
            arrayList.add(num.charAt(i));
        }
        
        Collections.reverse(arrayList);
        System.out.println("arrayList = " + arrayList);
        int[] answer = new int[arrayList.size()];
        

        for (int i=0; i< arrayList.size(); i++){
            answer[i] = Integer.parseInt(String.valueOf(arrayList.get(i)));
        }
    }
}
