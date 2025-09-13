class Solution {

    // Node class for linked list
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n <= 1) return; // no rotation needed
        k = k % n;          // handle cases like k = 7 for arr = [1,2]

        // Step 1: Convert array → linked list
        Node head = arrayToCircularList(nums);

        // Step 2: Find new head after rotation
        // Move (n - k) steps to find the new head
        int steps = n - k;
        Node tail = head;
        for (int i = 0; i < steps - 1; i++) {
            tail = tail.next;
        }

        // Now tail.next is the new head
        head = tail.next;

        // Break the circle
        tail.next = null;

        // Step 3: Convert linked list → array
        listToArray(head, nums);
    }

    // Convert array → circular linked list
    private Node arrayToCircularList(int[] nums) {
        Node head = new Node(nums[0]);
        Node temp = head;

        for (int i = 1; i < nums.length; i++) {
            temp.next = new Node(nums[i]);
            temp = temp.next;
        }

        temp.next = head; // make it circular
        return head;
    }

    // Convert linked list → array (overwrite nums[])
    private void listToArray(Node head, int[] nums) {
        Node temp = head;
        int i = 0;
        while (temp != null && i < nums.length) {
            nums[i++] = temp.data;
            temp = temp.next;
        }
    }
}
