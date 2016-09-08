package step1;


public class TestHash {
	public static void main(String[] args) {
		Hash hash = new Hash(10);
		int key = 1;
		//hash.hashFunction(key);
		hash.put(key, 10);
		System.out.println(hash.get(key));
	}
}
