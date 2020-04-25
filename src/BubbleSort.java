public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {5,7,3,1,9,7,3,5,7};
        print(arr);
        sort(arr);
        print(arr);
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

    public static void print(int[] arr) {
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
