import java.util.ArrayList;
import java.util.*;

public class KthSmallestElementInBST {

    TreeSet<Integer> set = new TreeSet();

    public int kthsmallest(TreeNode A, int B) {

        inOrder(A);
        //System.out.println(set);
        ArrayList<Integer> list = new ArrayList();

        for(Integer x: set)
            list.add(x);

        //System.out.println(list);

        return list.get(B-1);

    }

    public void inOrder(TreeNode N){

        if(N==null)
            return;

        inOrder(N.left);

        set.add(N.val);

        inOrder(N.right);

    }

}
