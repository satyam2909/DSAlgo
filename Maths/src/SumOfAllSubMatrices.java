//Sum of all Submatrices
//        Problem Description
//        Given a 2D Matrix A of dimensions N*N, we need to return the sum of all possible submatrices.
//
//        Problem Constraints
//        1 <= N <=30
//
//        0 <= A[i][j] <= 10
//
//        Input Format
//        Single argument representing a 2-D array A of size N x N.
//
//        Output Format
//        Return an integer denoting the sum of all possible submatrices in the given matrix.
//
//        Example Input
//        A = [ [1, 1]
//        [1, 1] ]
//
//        Example Output
//        16
//
//        Example Explanation
//        Number of submatrices with 1 elements = 4, so sum of all such submatrices = 4 * 1 = 4
//        Number of submatrices with 2 elements = 4, so sum of all such submatrices = 4 * 2 = 8
//        Number of submatrices with 3 elements = 0
//        Number of submatrices with 4 elements = 1, so sum of such submatrix = 4
//        Total Sum = 4+8+4 = 16


import java.util.ArrayList;

public class SumOfAllSubMatrices {
    public int solve(ArrayList<ArrayList<Integer>> A) {
        int n=A.size();
        int sum=0;
        for(int i=0; i<A.size(); i++){
            int tempsum=0;
            for(int j=0; j<A.size();j++){
                tempsum+=A.get(i).get(j)*(n-i)*(n-j)*(i+1)*(j+1);

            }
            sum+=tempsum;
        }
        return sum;
    }


}
