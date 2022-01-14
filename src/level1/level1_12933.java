package level1;

import java.util.ArrayList;
import java.util.Collections;

public class level1_12933 {
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
