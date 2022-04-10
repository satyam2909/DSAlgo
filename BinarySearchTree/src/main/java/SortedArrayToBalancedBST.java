
import java.util.List;

public class SortedArrayToBalancedBST {

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public TreeNode sortedArrayToBST(final List<Integer> A) {

        return constructTree(A,0,A.size()-1);

    }

    public TreeNode constructTree(List<Integer> A, int left, int right){

        if(left>right)
            return null;

        int mid = (left+right)/2;

        TreeNode root = new TreeNode(A.get(mid));

        root.left = constructTree(A,left,mid-1);

        root.right = constructTree(A,mid+1,right);

        return root;


    }

}
