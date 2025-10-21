package Sort1;

import java.util.*;

public class CountingSort1 {
    public static List<Integer> countingSort(List<Integer> arr) {
        int[] cnt = new int[100];
        for (int i: arr) ++cnt[i];
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < 100; ++i) res.add(cnt[i]);
        return res;
    }
}
