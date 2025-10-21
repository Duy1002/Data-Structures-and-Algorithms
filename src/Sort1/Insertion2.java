package Sort1;

import java.util.List;

public class Insertion2 {
    public static void insertionSort2(int n, List<Integer> arr) {
        for (int i = 1; i < n; ++i) {
            for (int j = i; j > 0; --j) {
                int aj = arr.get(j);
                int aj1 = arr.get(j - 1);
                if (aj < aj1) {
                    arr.set(j, aj1);
                    arr.set(j - 1, aj);
                } else {
                    break;
                }
            }
            for (Integer j : arr) System.out.print(j + " ");
            System.out.println();
        }
    }
}
