
//Given an integer A, find and return the Ath magic number.
//A magic number is defined as a number that can be expressed as a power of 5 or
//a sum of unique powers of 5.
//First few magic numbers are 5, 25, 30(5 + 25), 125, 130(125 + 5), ….


import java.util.ArrayList;
import java.util.Collections;

public class NthMagicNumber {

    public int solve(int A) {

        ArrayList<Integer> bin = new ArrayList<>();

        while(A>0){
            bin.add(A%2);
            A/=2;
        }
        Collections.reverse(bin);
        int ans=0;
        int pow=1;

        for(int i=bin.size()-1;i>=0;i--){
                if(bin.get(i)==1) {
                ans+=Math.pow(5,pow);
            }
            pow++;

        }

        //System.out.println(ans);

        return ans;

    }

}
