
//Given two BST A and B, return the (sum of all common nodes in both A and B) % (109 +7) .
//In case there is no common node, return 0.
//NOTE:
//Try to do it one pass through the trees.
//Problem Constraints
//1 <= Number of nodes in the tree A and B <= 105
//1 <= Node values <= 106


import java.util.HashSet;

public class CommonNodesinTwoBST {

    HashSet<Integer> set = new HashSet();
    long count =0l;
    public int solve(TreeNode A, TreeNode B) {

        inOrderA(A);
        inOrderB(B);

        count = count%1000000007;

        return (int)count;

    }

    public void inOrderA(TreeNode N){
        if(N==null)
            return;

        inOrderA(N.left);

        if(!set.contains(N.val))
            set.add(N.val);

        inOrderA(N.right);
    }

    public void inOrderB(TreeNode N){
        if(N==null)
            return;

        inOrderB(N.left);

        if(set.contains(N.val)){
            count+=(long)N.val;
        }

        inOrderB(N.right);
    }


}
