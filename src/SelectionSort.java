public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {5,7,3,1,9,7,3,5,7};
        print(arr);
        sort(arr);
        print(arr);
    }

    public static  void sort(int[] arr){
        int min = 0;
        int cmin = min;
     do {

         for (int i = cmin+1; i < arr.length; i++) {
             if (arr[i] < arr[cmin]) {
                 cmin = i;
             }
         }
         if(cmin!=min) {
             int x = arr[min];
             arr[min] = arr[cmin];
             arr[cmin] = x;
         }
             min++;
             cmin = min;

     }while(min < arr.length-1);
    }

    public static void print(int[] arr) {
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}
