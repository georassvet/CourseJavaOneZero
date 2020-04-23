import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        int x = 12, y=13, z=14;
        int number = sc.nextInt();

        if(number == x || number == y|| number == z){
            System.out.println("Данное значение имеется в константах");
        }else{
            System.out.println("Такой константы нет!");
        }
    }
}
