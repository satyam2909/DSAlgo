public class ExcelColumnNumber {

    public int titleToNumber(String A) {

        int n=  A.length();
        int res=0;
        int pow = 0;
        for(int i=n-1; i>=0;i--){
            res+=(int)Math.pow(26,pow)*(A.charAt(i)-'A'+1);
            //System.out.println(A.charAt(i)-'A');
            pow++;
        }

        return res;
    }

}
