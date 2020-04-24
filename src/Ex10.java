import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размерность матрицы x:");
        int x = sc.nextInt();
        System.out.print("Введите размерность матрицы y:");
        int y = sc.nextInt();

        int[][]matr=new int[x][y];

        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                System.out.print("Введите значение ячейки [" + i + ":" + j + "]: ");
                matr[i][j]=sc.nextInt();
            }

        }

        for(int i=0; i<x; i++){
            System.out.print(matr[i][0]*3+" ");
        }




    }
}
