package level1;

import java.util.ArrayList;

public class level1_12931 {
    public static void main(String[] args) {
        int n = 123;
        int answer = 0;

        String num = Integer.toString(n);
        ArrayList<Character>arrayList = new ArrayList<>();

        for (int i=0; i< num.length(); i++){
            arrayList.add(num.charAt(i));
        }

        for (int i=0; i< arrayList.size(); i++){
            answer += Integer.parseInt(String.valueOf(arrayList.get(i)));
        }

        System.out.println("answer = " + answer);

//        방법2
//
//        int answer = 0;
//
//        while(n>0){
//            answer += n%10;
//            n/=10;
//        }

    }
}
