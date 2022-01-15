package level1;

import java.util.ArrayList;
import java.util.Collections;


//함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
//      예를들어 n이 118372면 873211을 리턴하면 됩니다.
//
//        제한 조건
//        n은 1이상 8000000000 이하인 자연수입니다.
//        입출력 예
//        n	return
//        118372	873211

public class Level1_12933 {
    public static void main(String[] args) {
        long n = 118372;

        String num = Long.toString(n);

        ArrayList<Character>arrayList = new ArrayList<>();

        for (int i=0; i<num.length(); i++){
            arrayList.add(num.charAt(i));
        }

        Collections.sort(arrayList, Collections.reverseOrder());

        String ans = "";

        for (int i=0; i< arrayList.size(); i++){
            ans += arrayList.get(i);
        }

        long answer = Long.parseLong(ans);
    }
}
