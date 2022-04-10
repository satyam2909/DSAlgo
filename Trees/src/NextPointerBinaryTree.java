import java.util.LinkedList;
import java.util.Queue;

class TreeLinkNode {
      int val;
      TreeLinkNode left, right, next;
      TreeLinkNode(int x) { val = x; }
  }

public class NextPointerBinaryTree {
    public void connect(TreeLinkNode root) {

        Queue<TreeLinkNode> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();

            for(int i=0; i<size; i++){

                TreeLinkNode curr = q.remove();

                if(i==size-1)
                    curr.next = null;
                else
                    curr.next = q.peek();

                if(curr.left!=null)
                    q.add(curr.left);

                if(curr.right!=null)
                    q.add(curr.right);

            }
        }
    }
}
