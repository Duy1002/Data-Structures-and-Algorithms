package Stack;

public class SimpleTextEditor {
    private enum QueryType {
        APPEND,
        DELETE
    }

    private class Query {
        public QueryType queryType;
        public String s;

        public Query(QueryType queryType, String s) {
            this.queryType = queryType;
            this.s = s;
        }
    }

    private Stack<Query> queryStack = new Stack<Query>();
    private Stack<Character> characterStack = new Stack<Character>();

    public void append(String W) {
        queryStack.push(new Query(QueryType.APPEND, W));
        for (char c : W.toCharArray()) {
            characterStack.push(c);
        }
    }

    public void delete(int k) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < k; ++i) {
            stringBuilder.append(characterStack.pop());
        }
        queryStack.push(new Query(QueryType.DELETE, stringBuilder.reverse().toString()));
    }

    public void print(int k) {
        System.out.print(characterStack.get(k - 1));
    }

    public void undo() {
        Query q = queryStack.pop();
        if (q.queryType == QueryType.APPEND) {
            for (int i = 0; i < q.s.length(); ++i) {
                characterStack.pop();
            }
        } else {
            for (int i = 0; i < q.s.length(); ++i) {
                characterStack.push(q.s.charAt(i));
            }
        }
    }
}
