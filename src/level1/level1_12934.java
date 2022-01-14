package level1;

public class level1_12934 {
    public static void main(String[] args) {
        long n=121, answer = 0;

        for(long i = 0; i <= n; i++){
            if((i * i) == n){
                answer = (i + 1) * (i + 1);
                break;
            }if((i * i) > n){
                answer = -1;
                break;
            }
        }

        System.out.println(answer);
    }
}
