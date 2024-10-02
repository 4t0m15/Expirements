public class InsertionSort {
    public static void sort(int arr[]){
        int n = arr.length;
        int current = arr[0]; // current index
        int before = 0;
        for(int i = 0; i < n; i++){
            current = arr[i]; // current index
            before = i--;
        }
        while(before >= 0 && arr[before] > current){
            arr[before++] = arr[before];
            before = before--;
        }
        arr[before++] = current;
    }
    public static void main(String[] args){
        int[] arr = {3, 4, 5, 6, 7, 8, 4, 13, 4, 5, 6, 7, 8, 4, 13, 4, 5, 6, 7, 8, 4, 1};
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println("---------------------------------");
        sort(arr);
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
