package PriorityQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class FindTheRunningMedian {
    public static List<Double> runningMedian(List<Integer> a) {
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());
        List<Double> ans = new ArrayList<>();
        for (Integer i : a) {
            if (!maxPQ.isEmpty() && i < maxPQ.peek()) {
                minPQ.add(maxPQ.poll());
                maxPQ.add(i);
            } else {
                minPQ.add(i);
            }
            if (minPQ.size() > maxPQ.size()) maxPQ.add(minPQ.poll());
            if (maxPQ.size() > minPQ.size()) ans.add((double) maxPQ.peek());
            else ans.add((double) (maxPQ.peek() + minPQ.peek()) / 2);
        }
        return ans;
    }
}
