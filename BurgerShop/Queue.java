package BurgerShop;

public class Queue {
	public Node front;
	public Node back;
	public int size;
	public Queue() {
		front = null;
		back = null;
		size = 0;
	}
	public void Enqueue(Object o) {
		Node n = new Node(o);
		if(front == null) {
			front = n;
			back = n;
			size ++;
		}
		else {
			back.next = n;
			back = n;
			size ++;
		}
	}
	public Object dequeue() {
		Node temp = null;
		if(front != null) {
			temp = front;
			front = front.next;
			size --;
		}
		return temp.data;
	}

}
