public class MatchingParentheses {
    /* Tests if delimiters in the given expresssion are properly matched. */
    public static boolean isMatched(String expression){
        final String opening    = "({[";
        final String closing    = ")}]";
        ArrayStack<Character> buffer = new ArrayStack<>();
        for(char c : expression.toCharArray()) {
            if(opening.indexOf(c) != -1) {
                buffer.push(c);    
            }
            else if(closing.indexOf(c) != -1) {
                if(buffer.isEmpty())
                    return false;
                if(closing.indexOf(c) != opening.indexOf(buffer.pop()))
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(isMatched("{[((()))]}"));
    }
}
