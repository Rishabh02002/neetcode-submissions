/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null)
            return null;

        Map<Node, Node> nodeMap = new HashMap<>();

        // Pass 1: Create all copy nodes and store them in the map
        Node curr = head;
        while (curr != null) {
            nodeMap.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        // Pass 2: Connect the next and random pointers of the copy nodes
        curr = head;
        while (curr != null) {
            Node copyNode = nodeMap.get(curr);
            copyNode.next = nodeMap.get(curr.next); // Map automatically handles null for the tail
            copyNode.random = nodeMap.get(curr.random);
            curr = curr.next;
        }

        return nodeMap.get(head);
    }
}
