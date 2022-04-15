import java.util.ArrayList;

public class RemoveDuplicatesfromSortedArray {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int index = 1;
        int n = A.size();

        for (int i = 1; i < n; i++) {

            if (A.get(i).intValue() != A.get(i - 1).intValue()) {
                int temp = A.get(index);
                A.set(index, A.get(i));
                index++;
            }
        }
        System.out.println(A);
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < index; i++) {
            arr.add(A.get(i));

        }
        return arr;
    }
}
