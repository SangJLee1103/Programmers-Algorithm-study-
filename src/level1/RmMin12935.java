package level1;

import java.util.ArrayList;

public class RmMin12935 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        int min = arr[0];

        ArrayList<Integer> list = new ArrayList<>();


        for (int i = 1; i < arr.length; i++) {
            if (min >= arr[i]) {
                min = arr[i];
            }
        }

        for (int value : arr) {
            list.add(value);
        }

        if (list.size() <= 1) {
            list.clear();
            list.add(-1);
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == min) {
                list.remove(list.get(i));
            }
        }


        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        System.out.println("list = " + list);

    }
}
