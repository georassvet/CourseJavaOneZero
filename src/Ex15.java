import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Заполните массив:");
        int[] arr = new int[5];
        for(int i=0;i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int []sortArr = sort(arr);

        for(int i: sortArr){
            System.out.print(i+" ");
        }

    }
    public static int[] sort(int[] arr){
        for(int i=0; i< arr.length-1;i++){
            for(int j= i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int x = arr[j];
                    arr[j]=arr[i];
                    arr[i] = x;
                }
            }
        }

        return arr;
    }
}
