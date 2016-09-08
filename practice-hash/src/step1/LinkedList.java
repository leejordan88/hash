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
	//node에 key 와 value를 더함
	public void add(int key, int value) {
		Node node = new Node(key, value);
		if(index == 0){						//index값이 0이라면
			node.right = head;				//node.right에 head 방주소를 부여;
			head = node;					//head에 node을 부여 	node = new Node(key, value);
			index++;						//처음 node에 값이 부여되었으니 index값 하나 증가
			return ;						//메서드 종료
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
		//추가할 메서드
		return value;
		
	}
}
