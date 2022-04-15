import java.util.ArrayList;
import java.util.Stack;

public class SortStackUsingAnotherStack {

    public ArrayList<Integer> solve(ArrayList<Integer> A) {

        Stack<Integer> tempStack = new Stack<Integer>();
        Stack<Integer> input = new Stack<Integer>();

        for(int i=0; i<A.size(); i++)
            input.push(A.get(i));


        while(!input.isEmpty()){
            int temp = input.pop();

            while(!tempStack.isEmpty() && temp>tempStack.peek()){

                input.push(tempStack.pop());

            }
            tempStack.push(temp);
        }

        ArrayList<Integer> res = new ArrayList<>();

        System.out.println(tempStack);

        while(!tempStack.isEmpty())
            res.add(tempStack.pop());

        return res;

    }

}
