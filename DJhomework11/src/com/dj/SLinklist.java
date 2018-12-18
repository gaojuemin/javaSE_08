package com.dj;

public class SLinklist {
	public Node first ;
	private int pos = 0;
	public SLinklist() {
		this.first = null;
	}
	//增加头节点
	public void addfirstnode(int data) {
		Node node = new Node(data);
		node.next = first;
		first = node;
	}
	//删除第一个node
	public Node delefirstnode() {
		Node tempnode  = first;
		first = tempnode.next;
		return tempnode;
	}
	//在INDEX后面插入
	public void add (int index,int data) {
		Node node =new Node(data);
		Node current = first;
		Node previous =first;
		while (pos != index) {
			previous = current;
			current =current.next;
			pos++;
		}
		node.next = current;
		previous.next = node;
		pos =0;
	}
	
	//删除
	public Node Nodedeletenode(int index) {
		Node current =first;
		Node previous = first;
		while(pos != index) {
			pos++;
			previous =current;
			current = current.next;
		}
		if (current == first) {
			first = first.next;
		}
		else {
			pos=0;
			previous.next = current.next;
		}
		return current;
	}
	public void showNodes() {
        Node current = first;
        while (current != null) {
            current.print();
            current = current.next;
        }
        System.out.println();
    }
	
}
