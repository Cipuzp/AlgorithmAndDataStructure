package week1;

public class stacks {
	private Node first = null;

	private class Node {
		String item;
		Node next;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void push(String items) {
		Node oldfirst = first;//�ֽ�����ͷ��ָ�뱣��
		first = new Node();//�½��ڵ�
		first.item = items;//����ڵ�
		first.next = oldfirst;//��������
	}

	public void pop() {
		String item = first.item;//�����ڵ�ջ��Ԫ�ر���
		first = first.next;//ȥ����һ���ڵ�
		return;
	}
}
