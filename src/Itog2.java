import java.util.Scanner;

public class Itog2 {
    public static void main(String[] args) {
        /*
        * Написать программу сортировки по возрастанию заданного пользователем массива чисел.
        * Пользователь программы должен задавать размер массива и наполнять его числами.
        * Использовать одну из следующих сортировок: прямого выбора, вставки, быстрая, Шелла.
        * */

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите размер массива: ");

            int size = sc.nextInt();

            int[] arr = new int[size];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            print(arr);
            sort(arr);
            print(arr);
    }

    public static  void sort(int[] arr){
        for(int j =0; j<=arr.length -2; j++) {
            int min = j;
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[i] < arr[min]) {
                    min = i;
                }
            }
            if (j != min) {
                int x = arr[min];
                arr[min] = arr[j];
                arr[j] = x;
            }
        }
    }

    public static void print(int[] arr) {
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}
