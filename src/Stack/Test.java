package Stack;

public class Test {
    public static void testBalancedBrackets() {
        System.out.println(BalancedBrackets.isBalancedBrackets("{(})")); // false
        System.out.println(BalancedBrackets.isBalancedBrackets("{[]()}")); // true
    }

    public static void testSelectionSort() {
        int[] a = new int[]{3, 1, 4, 9, 6};
        SelectionSort.sort(a);
        for (int i = 0; i < a.length; ++i) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        // 1 3 4 6 9
    }

    public static void testSimpleTextEditor() {
        SimpleTextEditor simpleTextEditor = new SimpleTextEditor();
        simpleTextEditor.append("abc");
        simpleTextEditor.append("def");
        simpleTextEditor.delete(4);
        for (int i = 1; i <= 2; ++i) simpleTextEditor.print(i);
        System.out.println();
        // ab
        simpleTextEditor.undo();
        for (int i = 1; i <= 6; ++i) simpleTextEditor.print(i);
        System.out.println();
        // abcdef
        simpleTextEditor.undo();
        for (int i = 1; i <= 3; ++i) simpleTextEditor.print(i);
        System.out.println();
        // abc
    }

    public static void testEqualStacks() {
        int[] a1 = new int[]{3, 2, 1, 1, 1};
        int[] a2 = new int[]{4, 3, 2};
        int[] a3 = new int[]{1, 1, 4, 1};
        System.out.println(EqualStacks.maxEqualHeight(a1, a2, a3)); // 5
    }

    public static void main(String[] args) {
        testBalancedBrackets();
        testSelectionSort();
        testSimpleTextEditor();
        testEqualStacks();
    }
}
