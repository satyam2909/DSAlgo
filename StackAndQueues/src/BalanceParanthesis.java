import java.util.Stack;

public class BalanceParanthesis {

    public int solve(String A) {

        Stack<Character> stack = new Stack<>();
        int n = A.length();

        if(n%2 != 0)
            return 0;

        if(A.charAt(0)=='}' || A.charAt(0)==')' || A.charAt(0)==']')
            return 0;

        for(int i=0; i<n; i++){

            if(A.charAt(i)=='{' || A.charAt(i)=='(' || A.charAt(i)=='['){
                stack.push(A.charAt(i));
            }

            if(A.charAt(i)=='}' || A.charAt(i)==')' || A.charAt(i)==']'){

                if(A.charAt(i)=='}')
                {
                    if((char)stack.peek() =='{')
                        stack.pop();
                }

                if(A.charAt(i)==')')
                {
                    if((char)stack.peek() =='(')
                        stack.pop();
                }

                if(A.charAt(i)==']')
                {
                    if((char)stack.peek() =='[')
                        stack.pop();
                }

            }

        }
        if(!stack.isEmpty())
            return 0;

        return 1;
}

}
