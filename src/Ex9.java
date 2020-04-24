import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = sc.nextInt();
        System.out.println();

        int[] arr = new int[size];
        for(int i=0; i<arr.length;i++){
            System.out.print("Введите элемент массива №"+(i+1)+": ");
            arr[i]+= sc.nextInt();
            System.out.println();
        }

        int j = 0;
        while(j < arr.length){
            System.out.println(arr[j++] * 2);
        }


    }
}
