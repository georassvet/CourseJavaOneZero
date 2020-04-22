import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int res = 0;


        for(int i=0, j=input.length()-1; i < input.length(); i++,j--){
            if(input.charAt(i) == '1'){
                res+=Math.pow(2,j);
            }
        }

        System.out.println("res: " + res);

    }
}
