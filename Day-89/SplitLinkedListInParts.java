class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {

        ListNode[] ans = new ListNode[k];

        int length = 0;
        ListNode temp = head;

        while (temp != null) {
            length++;
            temp = temp.next;
        }

        int partSize = length / k;
        int extra = length % k;

        temp = head;

        for (int i = 0; i < k; i++) {

            ans[i] = temp;

            int currentSize = partSize;

            if (extra > 0) {
                currentSize++;
                extra--;
            }

            for (int j = 1; j < currentSize; j++) {
                temp = temp.next;
            }

            if (temp != null) {
                ListNode next = temp.next;
                temp.next = null;
                temp = next;
            }
        }

        return ans;
    }
}
