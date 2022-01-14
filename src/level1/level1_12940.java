package level1;

public class level1_12940 {
    public static void main(String[] args) {
        int n = 3, m = 12;
        
        int[] answer = new int[2];

        for(int i=1; i< n+m; i++){
            if(n%i==0 && m%i==0) {
                answer[0] = i;
                answer[1] = m*n/answer[0];
            }
        }


        
        for (int i=0; i< answer.length; i++){
            System.out.println("answer[i] = " + answer[i]);
        }

    }
}
