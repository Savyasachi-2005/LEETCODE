class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int c:nums){
            pq.offer(c);
            if(pq.size()>k)pq.poll();
        }
        return pq.peek();
    }
}