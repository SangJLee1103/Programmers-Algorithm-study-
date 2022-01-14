package level1;

import java.util.Locale;

public class Level1_12930 {
    public static void main(String[] args) {
        //"TrY HeLlO WoRlD"
        String s = "try hello world";
        
        String[] answer = s.split("");

        for (int i=0; i< answer.length; i++){
            if(answer[i].equals(" ")){
                answer[i]= " ";
            }else {
                if (i % 2 == 0) {
                    answer[i] = answer[i].toUpperCase();
                } else {
                    answer[i] = answer[i].toLowerCase();
                }
            }
        }

        String.join("", answer);

        for (int i=0; i< answer.length; i++) {
            System.out.print(answer[i]);
        }

    }
}
