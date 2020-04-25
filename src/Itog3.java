import java.util.Scanner;

public class Itog3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Курс доллара = ");
        double currency = sc.nextDouble();

        System.out.print("Количество рублей = ");
        double summ = sc.nextDouble();

        double convert = summ / currency;

        System.out.printf("Итого: %.2f долларов", convert);



    }
}
