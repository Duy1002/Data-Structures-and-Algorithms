package Stack;

/**
 * Nhận xét:
 * Thực tế thời gian chạy thuật toán này không có sự khác biệt nhiều với các dữ liệu khác nhau.
 * Best/Worst đều là O(N^2).
 */
public final class SelectionSort {
    private SelectionSort() {
    }

    static void sort(int a[]) {
        int n = a.length;
        for (int i = 0; i < n; ++i) {
            int min = Integer.MAX_VALUE;
            int idx = 0;
            for (int j = i; j < n; ++j) {
                if (a[j] <= min) {
                    min = a[j];
                    idx = j;
                }
            }
            int tmp = a[i];
            a[i] = a[idx];
            a[idx] = tmp;
        }
    }
}
