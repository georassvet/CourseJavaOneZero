import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
      /*  Необходимо написать программу, которая будет записывать текстовые данные, введенные с экрана, в файл .txt.
                Запись ввести в файл до тех пор, пока не будет введена команда стоп в консоли.
                Пользователь при тестировании программы по правилу черного ящика должен понимать,
                какой принцип остановки записи в файл он должен подать.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("please, write lines, enter 'stop' when you want to exit");
        try(PrintWriter printWriter = new PrintWriter("src\\resources\\text.txt")){
            do {
           String line = sc.nextLine();
           if(line.equals("stop")){
               break;
           }else {
                printWriter.println(line);
           }
            }while (true);

        }catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("Запись завершена!");
    }
}
