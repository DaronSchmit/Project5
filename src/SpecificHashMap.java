import java.util.List;
import java.util.LinkedList;

public class SpecificHashMap extends MyHashMap {

	private int length;

	@SuppressWarnings("unchecked")
	public SpecificHashMap() {
		this.length = 143;
		this.buckets = (LinkedList<String>[]) new LinkedList[length];
		for(int i=0; i<length;i++){
			this.buckets[i] = new LinkedList<String>();
		}
	}

	@Override
	protected int hash(String token) {
/*
		int totAscii = (int)token.charAt(0);
		int hashIndex;
		int len = token.length();

		for(int i = 1; i < len; i++){//generating an index
			totAscii += i*(int)token.charAt(i)*2;
		}
		hashIndex = totAscii;

		while(hashIndex >= this.length){
			//System.out.println(hashIndex);
			hashIndex /= 10;
		}
*/
		return 0;//hashIndex;
		
	}

	@Override
	public void add(String token) {
		
		int index = hash(token);
		if(this.buckets[index].contains(token)){
			return;
		}
		else{
			this.buckets[index].add(token);
			return;
		}

	
	}

	@Override
	public void display() {
		
		// TODO: IMPLEMENT DISPLAY METHOD TO SHOW CONTENTS OF ALL BUCKETS
		
	}
	
}
