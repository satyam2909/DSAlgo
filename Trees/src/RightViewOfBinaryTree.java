import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class RightViewOfBinaryTree {

    public class Solution {
        public ArrayList<Integer> solve(TreeNode A) {

            ArrayList<ArrayList<Integer>> res = new ArrayList<>();

            ArrayList<Integer> ans = new ArrayList<>();

            if (A == null)
                return ans;

            Queue<TreeNode> q = new LinkedList<>();

            q.add(A);

            while (!q.isEmpty()) {
                int size = q.size();
                ArrayList<Integer> temp = new ArrayList<>();

                for (int i = 0; i < size; i++) {

                    TreeNode curr = q.remove();
                    if (i == size - 1)
                        ans.add(curr.val);

                    if (curr.left != null) q.add(curr.left);
                    if (curr.right != null) q.add(curr.right);

                }
                // res.add(temp);
            }

            //System.out.println(res);

        /*for(int i=0; i<res.size(); i++){
            int last = res.get(i).size()-1;
            ans.add(res.get(i).get(last));

        }*/
            return ans;
        }
    }
}
