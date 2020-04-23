import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 3;
        for (int i=0; i < count; i++){
            System.out.print("Введите число №" + (i+1)+ ": ");
            sum += sc.nextInt();
            System.out.println();
        }
        int avg = sum/count;
        System.out.println("Среднее арифметическое " + avg);
        int avgDiv2 = avg / 2;
        if(avgDiv2 > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
