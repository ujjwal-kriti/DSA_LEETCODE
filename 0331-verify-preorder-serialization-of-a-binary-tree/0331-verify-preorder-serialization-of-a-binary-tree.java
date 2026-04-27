class Solution {
    public boolean isValidSerialization(String preorder) {
        String[] nodes = preorder.split(",");
        Deque<String> deque = new ArrayDeque<>();

        for (String node : nodes) {
            deque.offer(node);
        }

        int slots = 1;

        while (!deque.isEmpty()) {
            String node = deque.poll();
            slots--;

            if (slots < 0) return false;

            if (!node.equals("#")) {
                slots += 2;
            }
        }

        return slots == 0;
    }
}