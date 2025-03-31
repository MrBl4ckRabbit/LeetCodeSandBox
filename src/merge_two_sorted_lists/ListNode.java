package merge_two_sorted_lists;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static void main(String[] args) {

    }


}

class Solution{
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(); // Фиктивная голова
        ListNode current = dummy; // Текущий узел для построения результата

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // Присоединяем оставшиеся узлы
        current.next = (list1 != null) ? list1 : list2;

        return dummy.next; // Возвращаем настоящую голову
    }
}
