package programmers.level1;

public class Level1_12947 {
    public static void main(String[] args) {
        boolean answer = true;
        int x = 126;
        int sum = 0;
        String sX = String.valueOf(x);

        for(int i=0; i< sX.length(); i++){
            sum+=Integer.parseInt(String.valueOf(sX.charAt(i)));
        }

        if(x / sum != 0){
            answer = false;
        }


//        다른 풀이
//        int sum = String.valueOf(x).chars().map(ch -> ch - '0').sum();
//        return x % sum == 0;

    }
}
