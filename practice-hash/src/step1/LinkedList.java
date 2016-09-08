package step1;

public class LinkedList {
	private Node head;
	int index;
	//constructor
	public LinkedList(){
		head = null;
		index = 0;
	}
	
	//inner class
	public class Node{
		private Node right;
		private int key;
		private int value;
		//constructor
		public Node(Node right, int key, int value) {
			this.right = right;
			this.key = key;
			this.value = value;
		}
		//constructor
		public Node(int key, int value) {
			this.key = key;
			this.value = value;
		}
	}//class Node
	
	//method node
	public Node node(int index){
		Node node = head;
		for(int i = 0; i < index; i++){
			node = node.right;
		}
		return node;
	}
	//node�� key �� value�� ����
	public void add(int key, int value) {
		Node node = new Node(key, value);
		if(index == 0){						//index���� 0�̶��
			node.right = head;				//node.right�� head ���ּҸ� �ο�;
			head = node;					//head�� node�� �ο� 	node = new Node(key, value);
			index++;						//ó�� node�� ���� �ο��Ǿ����� index�� �ϳ� ����
			return ;						//�޼��� ����
		}else{
			Node temp1 = node(index -1);
			Node temp2 = temp1.right;
			temp1.right = node;
			node = temp2;
			index++;
		}//end if
	}//method add

	
	public int get(int key){
		Node temp = head;
		while(temp.key != key){
			temp = temp.right;
			if(temp == null){
				return -1;
			}
		}
		return temp.value;
	}
	public int change(int key, int value){
		//�߰��� �޼���
		return value;
		
	}
}
