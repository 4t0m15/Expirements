public class BubbleSort{
    public static void main(String[] args){
        int[] int_arr = {-5, 4, 3, 1, 5, 0};
        int temp;
        boolean swapped;
        for(int i = 0; i < int_arr.length -1; i++){
            swapped = false;
            for(int j = 0; j< int_arr.length - i - 1; j++){
                if(int_arr[j] > int_arr[j+1]){
                temp = int_arr[j];
                int_arr[j] = int_arr[j+1];
                int_arr[j+1] = temp;
                swapped = true;
                }
            }
            if(swapped == false){
                break;
            }
        // System.out.println("------");
        //     for(int l = 0; l<=int_arr.length; l++)
        //     {
        //         System.out.println(int_arr[l]);
        //     }
        // System.out.println("------");
        }
    }
}