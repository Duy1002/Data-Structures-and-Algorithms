package Sort2;

import java.util.List;

public class IntroToTutorialChallenges {
    public static int introTutorial(int V, List<Integer> arr) {
        for (int l = 0, r = arr.size() - 1; l <= r; ) {
            int m = (l + r) >> 1;
            if (arr.get(m) == V) return m;
            if (arr.get(m) < V) l = m + 1;
            else r = m - 1;
        }
        return -1;
    }
}
