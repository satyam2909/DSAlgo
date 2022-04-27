public class PalindromeInteger {

    public int isPalindrome(int A) {

        if (A<0)
            return 0;

        int original = A;
        int current = 0;
        int rev =0;
        while (A!=0){

            current = A%10;
            rev = (rev*10)+current;
            A = A /10;
        }
        if (original==rev)
            return 1;

        return 0;

    }

}
