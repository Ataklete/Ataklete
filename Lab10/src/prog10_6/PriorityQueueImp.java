package prog10_6;

public class PriorityQueueImp implements PriorityQueue{
	private MyBST bst;
	
	public PriorityQueueImp() {
		bst = new MyBST();
	}

	@Override
	public boolean find(String x) {
		// TODO Auto-generated method stub
	
		return bst.find(x);
	}

	@Override
	public boolean remove(String value) {
		// TODO Auto-generated method stub
		return bst.remove(value);
	}

	@Override
	public void insert(String x) {
		// TODO Auto-generated method stub
		bst.insert(x);
		
	}

	@Override
	public String findMin() {
		// TODO Auto-generated method stub
		return bst.findMin();
	}

	@Override
	public void printTree() {
		// TODO Auto-generated method stub
		bst.printTree();
	}
	
	public void printAsDiagram() {
		// TODO Auto-generated method stub
		bst.printAsDiagram();
	}
	
	public static void main(String[] args) {
		PriorityQueueImp pq = new PriorityQueueImp();
		pq.insert("James");
		pq.insert("Alex");
		pq.insert("Peter");
		pq.insert("Amite");
		
		pq.printTree();
		
		pq.printAsDiagram();
	}

}
