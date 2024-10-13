import java.util.Arrays;
public class Unique2{
/** Returns true if there are no duplicate elements in the array. */
public static void unique2(int[] data) {
    int n = data.length;
    int[] temp = Arrays.copyOf(data, n);    //make copy of data
    Arrays.sort(temp);                      //later sort data previously mentioned
    for(int j = 0; j < n-1; j++){
        if(temp[j] == temp[j+1])            //check neighboring entries
            //return false;
            System.out.println("false");                   //found duplicate pair
    //return true;   
                             //if this is found the elements are unique
    }
    System.out.println("true");
}
public static void main(String[] args){ int[] arr = {1, 2, 3, 4, 5, 6}; unique2(arr);}
}