class MyLinkedList {
    
    Node head;

	class Node {
		Node next;
		int data;

		public Node(int d) {
			data = d;
			next = null;
		}
	}

    /** Initialize your data structure here. */
    public MyLinkedList() {
        head = null;
    }
    
    /** Get the value of the index-th node in the linked list. 
	If the index is invalid, return -1. */
    public int get(int index) {
        int count = 0;
		Node n = head;
		while (n != null) {
			if (count == index)
				return n.data;
			count++;
			n = n.next;
		}
		return -1;
    }
    
    /** Add a node of value val before the first element of the linked list. 
	After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node new_node = new Node(val);
		new_node.next = head;
		head = new_node;
        return;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node new_node = new Node(val);
		if (head == null) {
			head = new Node(val);
			return;
		}
		Node last = head;
		while (last.next != null)
			last = last.next;
		last.next = new_node;
		return;
    }
    
    /** Find Length of Linked List */
	public int length(Node head) {
		if (head == null)
			return 0;
		int count = 0;
		Node n = head;
		while (n != null) {
			count++;
			n = n.next;
		}
		return count;
	}
    
    /** Add a node of value val before the index-th node in the linked list. 
	If index equals to the length of linked list, the node will be appended to the end of linked list. 
	If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        int size = length(head);
		if (index > size)
			return;
		if(index == 0) {
			addAtHead(val);
			return;
		} else if (index == size) {
			addAtTail(val);
			return;
		} else {
			Node curr = head;
			Node new_node = new Node(val);
			int count = 0;
			while (curr != null) {
				if (count == (index - 1)) {
					new_node.next = curr.next;
					curr.next = new_node;
				}
				count++;
				curr = curr.next;
			}
		}
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        Node temp = head;
        if (head == null)
			return;
		if (index == 0) {
			head = temp.next;
			return;
		}
		for (int i = 0; temp != null & i < index - 1; i++)
			temp = temp.next;
		if (temp == null || temp.next == null)
			return;
		Node deleteNode = temp.next.next;
		temp.next = deleteNode; 
		return;
    }
}