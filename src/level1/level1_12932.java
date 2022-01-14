package level1;

import java.util.ArrayList;
import java.util.Collections;

public class level1_12932 {
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
