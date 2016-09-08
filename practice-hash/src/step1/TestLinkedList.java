package step1;

public class TestLinkedList {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(4, 10);
		list.add(7, 8);
		System.out.println(list.get(4));
		System.out.println(list.get(7));
	}
}
