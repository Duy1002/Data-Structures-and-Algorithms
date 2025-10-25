package Sort2;

import java.util.ArrayList;
import java.util.List;

public class Quicksort1 {
    public static List<Integer> quickSort(List<Integer> arr) {
        int pivot = arr.get(0);
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        ArrayList<Integer> equal = new ArrayList<>();
        for (Integer i : arr) {
            if (i < pivot) left.add(i);
            else if (i == pivot) equal.add(i);
            else right.add(i);
        }
        left.addAll(equal);
        left.addAll(right);
        return (List) left;
    }
}
