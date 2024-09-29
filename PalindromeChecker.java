// package code.Queue;

// public class QueueExercises{
//     // public static boolean isPalindrome(String S, ArrayQueue<Character> queue){
//     //     for(int i = 0; i < S.length(); i++){
//     //         queue.enqueue(S.charAt(i));
//     //         System.out.println(queue);
//     //     }
//     //     for(int j = 0; j < S.length(); j++){
//     //         System.out.println("test1");
//     //         if(S.charAt(j) != queue.dequeue()){return false;}
//     //     }
//     //     return true;
//     // }
//     public static boolean isPalindrome(String s, ArrayQueue<Character> queue) {
//         // Handle edge cases
//         if (s == null || s.isEmpty()) {
//             return true;
//         }

//         // Enqueue each character of the string
//         for (int i = 0; i < s.length(); i++) {
//             queue.enqueue(s.charAt(i));
//         }

//         // Check if the string is a palindrome
//         for (int j = 0; j < s.length(); j++) {
//             if (s.charAt(j) != queue.dequeue()) {
//                 return false;
//             }
//         }
//         return true;
//     }
//     // i give up
//     // public static void main(String[] args){
//     //     ArrayQueue<Character> queue = new ArrayQueue<>();
//     //     System.out.println(isPalindrome("test", queue));
//     // }
// }
import java.util.LinkedList;

public class PalindromeChecker {
    public static boolean isPalindrome(String s, Queue<Character> queue) {
        for (char c : s.toCharArray()) {
            queue.enqueue(c);
        }

        for (char c : s.toCharArray()) {
            if (c != queue.dequeue()) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Queue<Character> queue = new ArrayQueue<>();
        System.out.println(isPalindrome("racecar", queue));  // Output: true
        System.out.println(isPalindrome("hello", queue));    // Output: false
    }
}