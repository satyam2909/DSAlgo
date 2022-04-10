import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrdertraversal {

    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode A) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        if(A==null)
            return res;

        Queue<TreeNode> q = new LinkedList<>();

        q.add(A);

        while(!q.isEmpty()){

            int size = q.size();
            ArrayList<Integer> list = new ArrayList<>();

            for(int i=0; i<size; i++){
                TreeNode node = q.remove();
                list.add(node.val);
                if(node.left!=null)q.add(node.left);
                if(node.right!=null)q.add(node.right);
            }
            res.add(list);
        }
        return res;

    }

}
