
//Given two binary trees, check if they are equal or not.
//Two binary trees are considered equal if they are structurally identical and the nodes have the same value.

import java.util.ArrayList;

public class IdenticalBinaryTrees {

    ArrayList<Integer> Atraversal = new ArrayList<>();
    ArrayList<Integer> Btraversal = new ArrayList<>();

    public int isSameTree(TreeNode A, TreeNode B) {

        PreOrder(A,Atraversal);
        PreOrder(B,Btraversal);
        //System.out.println(Atraversal);

        if(Atraversal.equals(Btraversal))
            return 1;
        return 0;

    }

    public void PreOrder(TreeNode N, ArrayList<Integer> list){

        if(N==null)
            return;

        list.add(N.val);
        PreOrder(N.left,list);
        PreOrder(N.right,list);

    }

}
