import java.util.ArrayList;

//Given three sorted arrays A, B and Cof not necessarily same sizes.
//Calculate the minimum absolute difference between the maximum and minimum number from the triplet a, b, c such
//that a, b, c belongs arrays A, B, C respectively. i.e. minimize | max(a,b,c) - min(a,b,c) |.

//Kinda 3  pointer :)
public class MinimizeTheAbsolutedifference {
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
        int i=0;
        int j=0;
        int k=0;
        int min =Integer.MAX_VALUE;
        int temp=Integer.MAX_VALUE;
        while (i<A.size() && j<B.size() && k<C.size()){

            //System.out.println(i+" "+j+" "+k+" "+min);

            temp = min(A.get(i),B.get(j),C.get(k));

            if(A.get(i) <= B.get(j) && A.get(i) <= C.get(k))
                i++;

            else if(B.get(j) <= A.get(i) && B.get(j) <= C.get(k))
                j++;

            else
                k++;

            if(min>temp)
                min =temp;
        }


        return min;

    }

    public int min(int a, int b, int c){
        int max=0;
        int min = 0;
        if(a>=b && a>=c){

            max = a;
        }
        else if(b>=a && b>=c){
            max = b;}
        else
            max = c;

        if(a<=b && a<=c){
            min = a;
        }
        else if(b<=a && b<=c){
            min = b;}
        else
            min = c;

        return max-min;

    }
}
