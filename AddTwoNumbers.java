package practice;
public class AddTwoNumbers {

    public static class ListNode {
        int value;
        ListNode next;

        ListNode() {}

        ListNode(int value) {
            this.value = value;
        }

        ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }

        // Helper method to create a linked list from an array
        public static ListNode arrayToList(int[] arr) {
            ListNode dummyHead = new ListNode();
            ListNode current = dummyHead;

            for (int value : arr) {
                current.next = new ListNode(value);
                current = current.next;
            }

            return dummyHead.next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode();
        ListNode current = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int value1 = (l1 != null) ? l1.value : 0;
            int value2 = (l2 != null) ? l2.value : 0;

            int totalSum = value1 + value2 + carry;
            carry = totalSum / 10;

            current.next = new ListNode(totalSum % 10);
            current = current.next;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        return dummyHead.next;
    }

    public static void main(String[] args) {
        // Example linked lists from arrays
        int[] arr1 = {2, 4, 3};
        int[] arr2 = {5, 6, 4};

        ListNode l1 = ListNode.arrayToList(arr1);
        ListNode l2 = ListNode.arrayToList(arr2);

        AddTwoNumbers solution = new AddTwoNumbers();
        ListNode result = solution.addTwoNumbers(l1, l2);

        // Print the result
        while (result != null) {
            System.out.print(result.value + " -> ");
            result = result.next;
        }
    }
}
