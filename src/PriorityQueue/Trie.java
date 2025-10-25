package PriorityQueue;

import java.io.*;
import java.nio.file.*;

public class Trie {
    private static final int R = 128; // ASCII

    private class Node {
        int count = 0;
        Node[] children = new Node[R];
    }

    private Node root = new Node();

    public void add(String s) {
        Node n = root;
        for (char c : s.toCharArray()) {
            if (n.children[c] == null) n.children[c] = new Node();
            n = n.children[c];
        }
        ++n.count;
    }

    private void print(Node n, StringBuilder sb, PrintWriter out) {
        if (n == null) return;
        if (n.count > 0) out.println(sb.toString() + ": " + n.count);
        for (char i = 0; i < R; ++i) {
            if (n.children[i] == null) continue;
            sb.append(i);
            print(n.children[i], sb, out);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public void print(PrintWriter out) {
        print(root, new StringBuilder(), out);
    }

    public static void main(String[] args) throws IOException, RuntimeException {
        Trie trie = new Trie();
        try (BufferedReader br = new BufferedReader(new FileReader("src/PriorityQueue/words.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (!line.isEmpty()) trie.add(line);
            }
        }
        try (PrintWriter out = new PrintWriter("src/PriorityQueue/output.txt")) {
            trie.print(out);
        }
        Path p1 = Paths.get("src/PriorityQueue/output.txt");
        Path p2 = Paths.get("src/PriorityQueue/correct.txt");
        long diff = Files.mismatch(p1, p2);
        if (diff != -1) throw new RuntimeException("Output không đúng!");
        System.out.println("Output chính xác!");
    }
}
