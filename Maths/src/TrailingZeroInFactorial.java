//Given an integer A, return the number of trailing zeroes in A! i.e., factorial of A.
//Note: Your solution should run in logarithmic time complexity.

public class TrailingZeroInFactorial {
    public int trailingZeroes(int A) {
        long i=5;
        int res=0;
        while(A>=i){
            res+=A/i;
            i*=5;
        }
        return (int)res;
    }
}


// kinda hard