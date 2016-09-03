package step1;

public class Hash {
	// Hash ����� ���� ����Ҵ� �迭�� �����Ѵ�.
	private int[] array;
	/*
	 * ���� ����
	 *  1. hashFunction�� ���ؼ� ���� �־ ��Ȯ�� ���� �Ǵ��� Ȯ��
	 *  2. put(method) �Ű�����(key, value)�� �̿��Ͽ�
	 *	3. get(method)���� ã��
	 */

	public Hash(int length) {
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
		array[index] = value;
	}

	public int get(int key) {
		int index = hashFunction(key);
		int value = 0;
		value = array[index];
		return value;
	}

}
