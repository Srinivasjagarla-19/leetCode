class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b) -> a.val - b.val);
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        for(int i=0; i<lists.length;i++){
            if(lists[i] != null){
                pq.add(lists[i]);
            }
        }
        while(!pq.isEmpty()){
            ListNode minNode = pq.poll();
            temp.next = minNode;
            temp = minNode;
            if(minNode.next != null){
                pq.add(minNode.next);
            }
        }
        return dummy.next;
    }
}