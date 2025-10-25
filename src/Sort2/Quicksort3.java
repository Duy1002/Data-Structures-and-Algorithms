package Sort2;

import java.util.List;

public class Quicksort3 {
    public static int partition(List<Integer> a, int lo, int hi) {
        int pivot = a.get(hi), i = lo;
        for (int j = lo; j < hi; ++j) {
            if (a.get(j) <= pivot) {
                int tmp = a.get(i);
                a.set(i, a.get(j));
                a.set(j, tmp);
                ++i;
            }
        }
        int tmp = a.get(i);
        a.set(i, a.get(hi));
        a.set(hi, tmp);
        return i;
    }

    public static void quicksort(List<Integer> a, int lo, int hi) {
        if (lo < hi) {
            int p = partition(a, lo, hi);
            for (Integer i : a) System.out.print(i + " ");
            System.out.println();
            quicksort(a, lo, p - 1);
            quicksort(a, p + 1, hi);
        }
    }

    public static void quicksort(List<Integer> a) {
        quicksort(a, 0, a.size() - 1);
    }
}
