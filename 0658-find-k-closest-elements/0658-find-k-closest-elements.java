
class Solution {

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<int[]> heap = new PriorityQueue<>(
            (a, b) -> {
                if(a[0] == b[0]) {
                    return a[1] - b[1];
                }
                return a[0] - b[0];
            }
        );
        for(int num : arr) {

            int dist = Math.abs(num - x);

            heap.add(new int[]{dist, num});
        }
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < k; i++) {

            int[] cur = heap.poll();

            res.add(cur[1]);
        }
        Collections.sort(res);
        return res;
    }
}