//Sieve of Eratosthenes.

//Given an even number A ( greater than 2 ), return two prime numbers whose sum will be equal to the given number.
//
//        If there is more than one solution possible, return the lexicographically smaller solution.
//
//        If [a, b] is one solution with a <= b, and [c,d] is another solution with c <= d, then
//        [a, b] < [c, d], If a < c OR a==c AND b < d.
//        NOTE: A solution will always exist. Read Goldbach's conjecture.

import java.util.ArrayList;

public class PrimeSum {

    public ArrayList<Integer> primesum(int A) {

        ArrayList<Integer> sieve = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();

        for(int i=0; i*i<=A; i++){
            sieve.add(1);
        }

        for(int i=2; i<sieve.size();i++){
            if(sieve.get(i)==1){

                for(int j=i*i; j<sieve.size();j=j+i){
                    sieve.set(j,0);
                }
            }
        }


        for(int i=2;i*i<=A;i++){
            if(sieve.get(i)==1 && sieve.get(A-i)==1)
            {
                res.add(i);
                res.add(A-i);
                break;
            }

        }

        // System.out.println(sieve);
        // System.out.println(res);
        return res;
    }

}
