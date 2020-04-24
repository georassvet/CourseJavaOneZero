import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");

        String s = sc.next();
        System.out.println(s);
        int i = Integer.parseInt(s);
        System.out.println(i);
        double d = i;
        System.out.println(d);

    }
}
