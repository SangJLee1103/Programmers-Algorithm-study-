package level1;

public class Level1_12918 {
    public static void main(String[] args) {
        String s = "a234";
        boolean answer = true;

        if(s.length() == 4 || s.length() == 6){
            try{
                Integer.parseInt(s);
                 answer = true;
            }catch (NumberFormatException e){
                 answer = false;
            }
        }else answer = false;

    }
}
