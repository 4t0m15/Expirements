

public class Palindrome{}
//     public static void main(String[] args){
//         String palindrome = "racecar";
//         int palindromelength = palindrome.length();
//         ArrayQueue palindromequeue = new ArrayQueue<Character>();
//         for(int j = 0; j < palindromelength; j++){
//             Character char0 = palindrome.charAt(j);
//             palindromequeue.enqueue(char0);
//             System.out.println("debug1");
//         }
//         int old_size = palindrome.length();
//         int new_size = old_size;
//         boolean odd = false;
//         if(palindrome.length()%2==1){
//             odd = true;
//             System.out.println("debug2");
//         }
//         for(int i = 0; i< new_size; i++){
//             System.out.println("debug3");
//             new_size = old_size - 1;
//             if(palindrome.charAt(i) == palindrome.charAt(new_size)){
//                 System.out.println("debug4");
//                 System.out.println("Good so far");
//             }
//             palindromequeue.dequeue();
//             System.out.println("debug5");
//             if(new_size == (old_size/2)){
//                 break;
//             }
//             else if(new_size == (old_size/2) + 1 && odd){
//                 break;
//             }
//         }
//     }
// }