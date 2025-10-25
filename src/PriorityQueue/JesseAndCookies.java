package PriorityQueue;

import java.util.List;
import java.util.PriorityQueue;

public class JesseAndCookies {
    public static int cookies(int k, List<Integer> A) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(A);
        while (!pq.isEmpty()) {
            int x = pq.poll();
            if (x >= k) return A.size() - pq.size() - 1;
            if (pq.isEmpty()) return -1;
            int y = pq.poll();
            pq.add(x + 2 * y);
        }
        return -1;
    }
}
