import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedArrays {

    public ArrayList<Integer> solve(final List<Integer> A, final List<Integer> B) {

        ArrayList<Integer> res = new ArrayList<>();

        int i=0;
        int j=0;

        while(i<A.size() && j<B.size()){
            //System.out.println(i+" "+j);
            if(A.get(i)<B.get(j)){
                res.add(A.get(i));
                i++;
            }
            else if(A.get(i)>B.get(j)){
                res.add(B.get(j));
                j++;
            }
            else{
                res.add(A.get(i));
                res.add(B.get(j));
                i++;
                j++;
            }
        }

        while(i<A.size()){
            res.add(A.get(i));
            i++;
        }

        while(j<B.size()){
            res.add(B.get(j));
            j++;
        }
        return res;

    }
}
