import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;

public class Ex16 {
    public static void main(String[] args) {

        try(BufferedReader reader =new BufferedReader(new FileReader("src\\resources\\text.txt"))){
            String line;
            while((line=reader.readLine())!=null){
                System.out.println(line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

