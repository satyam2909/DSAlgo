

//Given a binary tree of integers. Find the difference between the sum of nodes at odd level and sum of nodes at even level.
//NOTE: Consider the level of root node as 1.

import java.util.LinkedList;
import java.util.Queue;

public class OddAndEvenLevels {

    public int solve(TreeNode A) {

        long oddsum =0;
        long evensum=0;
        int level = -1;

        Queue<TreeNode> q = new LinkedList<>();

        q.add(A);

        while(!q.isEmpty()){
            level++;
            int size = q.size();

            for(int i=0; i<size; i++){

                TreeNode root = q.remove();

                if(level%2==0)
                    evensum+=root.val;
                else
                    oddsum+=root.val;

                if(root.left!=null) q.add(root.left);
                if(root.right!=null) q.add(root.right);
            }
        }

        return (int)(evensum-oddsum);

    }

}
