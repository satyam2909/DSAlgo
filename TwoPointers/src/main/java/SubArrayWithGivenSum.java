
//Given an array of positive integers A and an integer B, find and return first continuous subarray which adds to B.
//If the answer does not exist return an array with a single element "-1".
//First sub-array means the sub-array for which starting index in minimum.

import java.util.ArrayList;

public class SubArrayWithGivenSum {

    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        ArrayList<Integer> res = new ArrayList<>();
        ArrayList<Integer> r1 = new ArrayList<>();

        if (A.get(0).equals(B)) {
            res.add(A.get(0));
            return res;
        }

        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == B) {
                res.add(A.get(i));
                return res;
            }
        }


        int l = 0;
        int r = 1;
        int sum = A.get(0);
        while (l <= r && r < A.size()) {
            //System.out.println(l+" "+r);

            if (sum == B) {
                for (int i = l; i < r; i++) {
                    r1.add(A.get(i));

                }
                return r1;

            } else if (sum < B) {
                sum += A.get(r);
                r++;
            } else if (sum > B) {
                sum -= A.get(l);
                l++;
            }
            // System.out.println(l+" "+r);
        }
        r1.add(-1);

        return r1;


    }
    }
