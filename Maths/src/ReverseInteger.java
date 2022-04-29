public class ReverseInteger {

    public int reverse(int A) {

        int res =0;
        int curr = 0;
        int x=1;
        if(A<0)
            x=-1;
        //System.out.println(00123);

        while (A!=0){

            curr = A%10;
            res = (res*10)+curr;
            A=A/10;
        }
        return res;
    }
}
