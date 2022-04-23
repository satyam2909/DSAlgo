//There is a shop whose assistant told you that there are A puzzles in the shop and you want to buy B of them.
//They might differ in difficulty and size. The first jigsaw puzzle consists of A1 pieces,
//the second one consists of A2 pieces and so on.
//You decided that the difference between the numbers of pieces in bought puzzles must be as small as possible.
//Let x be the number of pieces in the largest puzzle that the you buy and y be the number of pieces in the smallest such puzzle.
//You want to choose such B puzzles that x-y is as minimum as possible. Find the least possible value of x-y.

import java.util.ArrayList;
import java.util.Collections;

public class MinimumDiffPuzzle {

    public int solve(ArrayList<Integer> A, int B) {
        if(A.size()==1)
            return 0;

        Collections.sort(A);

        int min = Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
        int minsum = Integer.MAX_VALUE;
        for (int i=0; i<=A.size()-B;i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=i ;j<B+i;j++){
                temp.add(A.get(j));

            }
            //System.out.println(temp);
            min = temp.get(0);
            max = temp.get(B-1);

            if(max-min<minsum)
                minsum = max-min;
            //System.out.println(minsum);
        }
        return minsum;
    }
}
