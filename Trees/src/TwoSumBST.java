import java.util.ArrayList;
import java.util.HashSet;

public class TwoSumBST {
    ArrayList<Integer> list = new ArrayList<>();
    HashSet<Integer> set = new HashSet<>();
    int ans = 0;
    int C  =0;
    public int t2Sum(TreeNode A, int B) {
        C=B;
        inOrder(A);

        return ans;
    }

    public void inOrder(TreeNode A){
        if(A==null)
            return;
        inOrder(A.left);
        list.add(A.val);
        if(set.contains(C-A.val))
            ans=1;
        else
            set.add(A.val);

        inOrder(A.right);

    }
}
