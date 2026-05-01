class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i : arr){
            pq.add(i);
            if(pq.size() > k ){
                pq.remove(pq.peek());


            }
        }
//        System.out.println(pq);

        return pq.peek();
    }
}
