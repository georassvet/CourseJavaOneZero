import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Itog3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try(FileReader fr = new FileReader("src\\resources\\text.txt")) {
            char[] ch = new char[200];
            fr.read(ch,0,ch.length);

            for(char c : ch){
                System.out.print(c);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.print("Курс доллара = ");
        double currency = sc.nextDouble();

        System.out.print("Количество рублей = ");
        double summ = sc.nextDouble();

        double convert = summ / currency;

        System.out.printf("Итого: %.2f долларов", convert);



    }
}
