class Solution {

    class Pair {
        TreeNode node;
        int row;
        int col;

        Pair(TreeNode node, int row, int col) {
            this.node = node;
            this.row = row;
            this.col = col;
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();

        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root, 0, 0));

        while (!queue.isEmpty()) {

            int size = queue.size();

            for (int i = 0; i < size; i++) {

                Pair p = queue.poll();
                TreeNode node = p.node;
                int row = p.row;
                int col = p.col;

                map.putIfAbsent(col, new TreeMap<>());
                map.get(col).putIfAbsent(row, new PriorityQueue<>());
                map.get(col).get(row).offer(node.val);

                if (node.left != null) {
                    queue.offer(new Pair(node.left, row + 1, col - 1));
                }

                if (node.right != null) {
                    queue.offer(new Pair(node.right, row + 1, col + 1));
                }
            }
        }

        for (TreeMap<Integer, PriorityQueue<Integer>> rows : map.values()) {

            List<Integer> list = new ArrayList<>();

            for (PriorityQueue<Integer> pq : rows.values()) {
                while (!pq.isEmpty()) {
                    list.add(pq.poll());
                }
            }

            result.add(list);
        }

        return result;
    }
}