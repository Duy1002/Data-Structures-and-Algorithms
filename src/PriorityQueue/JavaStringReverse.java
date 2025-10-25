package PriorityQueue;

import java.util.Objects;

public class JavaStringReverse {
    public static boolean isPalindrome(String s) {
        return Objects.equals(s, new StringBuilder(s).reverse().toString());
    }
}
