package step1;

public class HashNode {
	class Node{
		private int value;
		private Node next;
		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
		
	}
	// Hash ����� ���� ����Ҵ� �迭�� �����Ѵ�.
	private int[] array;
	private Node[] nArray;
	/*
	 * ���� ���� 1. hashFunction�� ���ؼ� ���� �־ ��Ȯ�� ���� �Ǵ��� Ȯ�� 2. put(method) �� 1�� ���� ��
	 * get(method)���� ã��
	 */

	
	public HashNode(int length) {
		array = new int [length];
	}

	private int hashFunction(int key) {
		int index = 0;
		index = key * 3 % array.length;
		return index;
	}

	public void put(int key, int value) {
		//key ���� �̿��� array�� ������ index�� Ȯ�� array[index]�� value�� ����
		int index = hashFunction(key);
//		nArray[index] = new Node();
	}

	public int get(int key) {
		return key;
		/*int index = hashFunction(key);
		int value = 0;
		value = array[index];
		return value;*/
	}

}
