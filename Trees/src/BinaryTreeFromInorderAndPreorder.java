import java.util.ArrayList;
import java.util.HashMap;


//Given preorder and inorder traversal of a tree, construct the binary tree.
//NOTE: You may assume that duplicates do not exist in the tree.


public class BinaryTreeFromInorderAndPreorder {

    int preCounter = 0;

    HashMap<Integer,Integer> map = new HashMap<>();

    public TreeNode buildTree(ArrayList<Integer> A, ArrayList<Integer> B) {
        // b-> Inorder

        for(int i=0; i<B.size(); i++)
            map.put(B.get(i),i);

        //System.out.println(map);

        return preInorderBuild(A,B,0,B.size()-1);
    }

    public TreeNode preInorderBuild(ArrayList<Integer> PreOrder, ArrayList<Integer> Inorder, int start, int end){

        if(start>end)
            return null;

        TreeNode root = new TreeNode(PreOrder.get(preCounter++));

        if(start==end)
            return root;

        int index_in_inorder = map.get(root.val);

        root.left = preInorderBuild(PreOrder,Inorder,start,index_in_inorder-1);

        root.right = preInorderBuild(PreOrder, Inorder,index_in_inorder+1, end);

        return root;
    }


}
