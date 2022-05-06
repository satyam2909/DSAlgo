//There are N players, each with strength A[i]. when player i attack player j,
//player j strength reduces to max(0, A[j]-A[i]). When a player's strength reaches
//zero, it loses the game, and the game continues in the same manner among other players until only 1 survivor remains.
//Can you tell the minimum health last surviving person can have?


import java.util.ArrayList;

public class PubG {
    public int solve(ArrayList<Integer> A) {

        if(A.size()==1)
            return A.get(0);


        int start = gcd(A.get(0),A.get(1));
        int res =0;
        //System.out.println(start);
        for(int i=2;i<A.size();i++){
            start = gcd(start,A.get(i));

        }
            return start;

    }

    public int gcd (int A, int B){
        if (A==0) return B;

        return gcd(B%A,A);

    }

}
