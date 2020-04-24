import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку 1: ");
        String s1 = sc.nextLine();
        System.out.print("Введите строку 2: ");
        String s2 = sc.nextLine();
        if(s1.length() == s2.length()){
            System.out.println("Длина строк одинаковая");
        }else {
            if (s1.length() > s2.length()) {
                System.out.println(s1);
            }else{
                System.out.println(s2);
            }
        }
    }
}
