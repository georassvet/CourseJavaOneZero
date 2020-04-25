import java.util.Scanner;

public class Itog1 {
    public static void main(String[] args) {
        /*
        * Ввести с консоли число в бинарном формате. Перевести его в десятичный формат, записать в переменную int и вывести на экран.
        * Необходимо использовать циклы, нельзя использования готовые методы языка Java,
        * для перевода числа из одной системы счисления в другую.
        * */

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите число в двоичном формате: ");
            String s = sc.next();

            if(s.equals("stop")){
                break;
            }

            int sum = 0;
            for (int i = 0, pos = s.length() - 1; i < s.length(); i++, pos--) {
                if (s.charAt(i) == '1') {
                    int temp = 1;
                    /* Math.pow()*/
                    for (int j = 0; j < pos; j++) {
                        temp *= 2;
                    }
                    sum += temp;
                }else if(s.charAt(i)!='0') {
                    System.out.println("Что-то пошло не так!");
                    break;
                }
            }

            System.out.println(s + " -> " + sum);
        }
    }

}
