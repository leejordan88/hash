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
	// Hash 저장소 생성 저장소는 배열로 생성한다.
	private int[] array;
	private Node[] nArray;
	/*
	 * 구현 내용 1. hashFunction을 구해서 값을 넣어서 정확히 리턴 되는지 확인 2. put(method) 값 1개 삽입 후
	 * get(method)으로 찾기
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
		//key 값을 이용해 array에 저장할 index를 확인 array[index]에 value값 삽입
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
