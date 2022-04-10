public class BalancedBinaryTree {

    int balanced = 1;

    public int isBalanced(TreeNode A) {

        balanced(A);
        return balanced;

    }

    public int balanced(TreeNode A){
        if(A==null)
            return 0;

        int lh = balanced(A.left)+1;
        int rh = balanced(A.right)+1;

        if(Math.abs(lh-rh)>1)
            balanced=0;

        return Math.max(lh,rh);

    }

}
