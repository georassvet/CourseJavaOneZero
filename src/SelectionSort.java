public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {5,7,3,1,9,7,3,5,7};
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
