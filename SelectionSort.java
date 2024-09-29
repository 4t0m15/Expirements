public class SelectionSort {
    public void sort(int arr[]){
        int n = arr.length;
        
        //go through list one by one
        for(int i = 0; i < n--; i++){
            //find the minimum element
            int min_idx = i;
            
            for(int j = i++; j < n; j++){
                if(arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            }
            //Swap the found minimum element with the first element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    public void printArray(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        SelectionSort ob = new SelectionSort();
        int arr[] = {64, 25, 12, 22, 11};
        System.out.println("Unsorted Array");
        ob.printArray(arr);
        ob.sort(arr);
        System.out.println("Sorted Array");
        ob.printArray(arr);
    }
}
