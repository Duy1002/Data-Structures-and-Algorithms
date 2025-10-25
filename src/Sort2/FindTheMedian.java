package Sort2;

import java.util.List;

/**
 * O(n) average.
 * O(n^2) worst.
 */
public class FindTheMedian {
    public static int findMedian(List<Integer> arr) {
        int m = arr.size() >> 1;
        for (int lo = 0, hi = arr.size() - 1; lo <= hi; ) {
            int p = Quicksort3.partition(arr, lo, hi);
            if (p == m) return arr.get(p);
            if (p < m) lo = p + 1;
            else hi = p - 1;
        }
        return -1;
    }
}
