package lab6_1;

public class MyTable {
	
	private Entry[] entries = new Entry[26];
	
	public String get(char k){
		int pos = ((int) k) - 97;
		return entries[pos].value;
	}
	
	public void add(char k, String v) {
		int pos = ((int) k) - 97;
		entries[pos] = new Entry(k, v);
	}
	
	@Override
	public String toString() {
		String result = "";
		for(int i = 0; i < entries.length; i++) {
			if(entries[i] != null) {
				//result += entries[i].getKey() + " -> " + entries[i].getValue() + "\n";
				result = result + entries[i] + "\n";
			}
		}
		return result;
	}
	
	private class Entry {
		
		char key;
		String value;
		
		Entry(char ch, String str){
			this.key = ch;
			this.value = str;
		}
		
		public char getKey() {
			return key;
		}
		
		public String getValue() {
			return value;
		}
		
		@Override
		public String toString() {
			return key + " -> " + value;
		}
		
	}

}