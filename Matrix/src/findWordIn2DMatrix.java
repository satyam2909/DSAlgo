import java.util.Arrays;

public class findWordIn2DMatrix {

    public void findWord(String[] args) {

        String[][] A = {
                {"a", "b", "c", "a", "q"},
                {"u", "h", "a", "a", "t"},
                {"a", "a", "t", "a", "v"},
                {"a", "b", "t", "a", "b"},
                {"q", "l", "c", "a", "o"},
        };

        System.out.println(Arrays.deepToString(A));

        String[][] h = new String[5][5];

        String find = "cat";

        for(int i=0; i<5; i++){
            for(int j=4; j>=0; j--){

                if(j==4)
                    h[i][j] = A[i][j];
                else {
                    h[i][j] = A[i][j] + h[i][j + 1];
                    if(h[i][j].equals(find)){
                        System.out.println("word exists");
                        break;}
                }
            }
        }

        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){

                if(j==0)
                    h[j][i] = A[j][i];
                else {
                    h[j][i] =  h[j-1][i] + A[j][i];
                    if(h[j][i].equals(find)){
                        System.out.println("word exists");
                        break;}
                }
            }
        }
        System.out.println(Arrays.deepToString(h));
    }

}
