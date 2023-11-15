package prog3;

public class AccountList {
	
	private final int INITIAL_LENGTH = 2;
	private Account[] acctArray; 
	private int size;
	
	public AccountList() {
		acctArray = new Account[INITIAL_LENGTH];
		size = 0;
	}
	
	public void add(Account s){
		if(size == acctArray.length)
			resize();
		acctArray[size] = s;
		size++;
	}
	
	public Account get(int i){
		if(i < 0 || i >= acctArray.length) {
			System.out.println("index out of bound");
		}
		return acctArray[i];
	}
	
	public boolean find(Account s){
		for(int i = 0; i < acctArray.length; i++) {
			if(acctArray[i].equals(s))
				return true;
		}
		return false;
	}
	
	public void insert(Account s, int pos){
		if(pos < 0 || pos > size)
			System.out.println("Invalid position");
		else if(pos == size)
			add(s);
		else if(acctArray.length == size) {
			resize();
			insertAt(s, pos);
		} else {
			insertAt(s, pos);
		}	
	}
	
	public void insertAt(Account s, int pos) {
		for(int i = pos; i < size; i++) {
			Account temp = acctArray[i];
			acctArray[i] = s;
			s = temp;
		}
		size++;
	}
	
	public boolean remove(Account s){
		for (int i = 0; i < acctArray.length; i++) {
			if (acctArray[i].equals(s)) {
				for (int j = i; j < acctArray.length - 1; j++) {
					acctArray[j] = acctArray[j + 1];
				}
				acctArray[acctArray.length - 1] = null;
				size--;
				return true;
			}
		}
		return false;
	}
	
	private void resize(){
		Account[] newStrArray = new Account[acctArray.length * 2];
			System.arraycopy(acctArray, 0, newStrArray, 0, acctArray.length);
			acctArray = newStrArray;
	}
	
	public int size() {
		return size;
	}
	
	public Account[] getAccounts() {
		return acctArray;
	}

}
