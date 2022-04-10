public class DiameterOfBinarytree {
    int diameter = 0;
    public int solve(TreeNode A) {

        getDiameter(A);
        return diameter;
    }

    public int getDiameter(TreeNode A){

        if(A==null)
            return -1;

        int lh = getDiameter(A.left);
        int rh = getDiameter(A.right);

        diameter = Math.max(diameter, lh+rh+2);

        return Math.max(lh,rh)+1;

    }
}
