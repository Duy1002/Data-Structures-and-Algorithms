package Stack;

public final class EqualStacks {
    private EqualStacks() {
    }

    public static int maxEqualHeight(int[] a1, int[] a2, int[] a3) {
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        Stack<Integer> s3 = new Stack<Integer>();
        int h1 = 0;
        int h2 = 0;
        int h3 = 0;
        for (int i = a1.length - 1; i >= 0; --i) {
            s1.push(a1[i]);
            h1 += a1[i];
        }
        for (int i = a2.length - 1; i >= 0; --i) {
            s2.push(a2[i]);
            h2 += a2[i];
        }
        for (int i = a3.length - 1; i >= 0; --i) {
            s3.push(a3[i]);
            h3 += a3[i];
        }
        while (!(h1 == h2 && h2 == h3)) {
            int max = Math.max(h1, Math.max(h2, h3));
            if (h1 == max) {
                h1 -= s1.pop();
            } else if (h2 == max) {
                h2 -= s2.pop();
            } else {
                h3 -= s3.pop();
            }
        }
        return h1;
    }
}
