import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bubble sort");
        System.out.println("Заполните массив:");
        int[] arr = new int[5];
        for(int i=0;i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        print(arr);
        sort(arr);
        print(arr);
    }

    public static void print(int[] arr) {
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static  void sort(int[] arr){
        boolean swaped;
        do{
            swaped = false;
            for(int i= 0; i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    int x = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1] = x;
                    swaped = true;
                }
            }

        } while(swaped);
    }
}
