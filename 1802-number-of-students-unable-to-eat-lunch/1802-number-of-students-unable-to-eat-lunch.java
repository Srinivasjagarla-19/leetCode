class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        for(int stu : students) q.offer(stu);
        int index = 0;
        int count = 0;

        while (!q.isEmpty()) {
            if (q.peek() == sandwiches[index]) {
                q.poll();
                index++;
                count = 0;
            } else {
                q.offer(q.poll());
                count++;
            }

            if (count == q.size()) break;
        }
        return q.size();

    }
}