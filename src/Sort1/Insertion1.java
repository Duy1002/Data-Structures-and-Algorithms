package Sort1;

import java.util.List;

public class Insertion1 {
    public static void insertionSort1(int n, List<Integer> arr) {
        for (int i = n - 1; i > 0; --i) {
            int ai = arr.get(i);
            int ai1 = arr.get(i - 1);
            if (ai < ai1) {
                arr.set(i, ai1);
                for (Integer j : arr) System.out.print(j + " ");
                System.out.println();
                arr.set(i - 1, ai);
            } else {
                break;
            }
        }
        for (Integer j : arr) System.out.print(j + " ");
        System.out.println();
    }
}
