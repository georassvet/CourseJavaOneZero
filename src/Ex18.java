import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        /*Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt,
         а потом в этот же файл перезаписывать текстовые данные, введенные вручную.
         Количество строк после перезаписи должно быть столько же, сколько и в изначальном варианте.*/

        Scanner sc = new Scanner(System.in);
        int counter= 0;

        try(BufferedReader reader = new BufferedReader(new FileReader("src\\resources\\text.txt"));){
            String line;

            while((line=reader.readLine())!=null){
                System.out.println(line);
                counter++;
            }

        }catch(IOException e) {
            e.printStackTrace();
        }
        //sc.nextLine();
        System.out.println("Введите " + counter +" строк!");
            try( PrintWriter printWriter = new PrintWriter("src\\resources\\text.txt")){
            for(int i=0; i<counter;i++){
                System.out.print("Cтрока " + (i+1)+": ");
                String s = sc.nextLine();
                printWriter.println(s);
            }

    }catch(IOException e){
        e.printStackTrace();
    }
        System.out.println("Запись завершена!");
    }
}
