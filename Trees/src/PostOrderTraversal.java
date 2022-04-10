import java.util.ArrayList;

public class PostOrderTraversal {

    ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<Integer> postorderTraversal(TreeNode A) {
        post(A);
        return list;
    }

    public void post(TreeNode N){

        if(N==null)
            return;

        post(N.left);

        post(N.right);

        list.add(N.val);


    }


}
