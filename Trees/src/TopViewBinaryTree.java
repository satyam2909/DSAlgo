import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TopViewBinaryTree {

    public class Pair {

        TreeNode node;
        int level;

        public Pair(TreeNode N, int level){
            this.node = N;
            this.level = level;
        }

    }

    public ArrayList<Integer> solve(TreeNode A) {

        ArrayList<Integer> res = new ArrayList<>();

        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();

        // treeMap can also be used

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        Queue<Pair> q = new LinkedList<>();

        Pair p = new Pair(A,0);

        q.add(p);

        while(!q.isEmpty())
        {
            int size = q.size();

            for(int i=0; i<size; i++){

                Pair currPair = q.remove();

                int level = currPair.level;

                min = Math.min(min,level);
                max = Math.max(max,level);

                if(!map.containsKey(level))
                    map.put(level,new ArrayList<Integer>());


                map.get(level).add(currPair.node.val);

                if(currPair.node.left!=null)
                    q.add(new Pair(currPair.node.left,level-1));

                if(currPair.node.right!=null)
                    q.add(new Pair(currPair.node.right,level+1));

            }

        }

        for(int i=min;i<=max;i++){
            res.add(map.get(i).get(0));
        }

        return res;
    }
}
