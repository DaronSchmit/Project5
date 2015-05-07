import java.util.List;
import java.util.LinkedList;

public class GeneralHashMap extends MyHashMap {
	
	private int length;

	@SuppressWarnings("unchecked")
	public GeneralHashMap() {
		this.length = 149;
		this.buckets = (LinkedList<String>[]) new LinkedList[length];
		for(int i=0; i<length;i++){
			this.buckets[i] = new LinkedList<String>();
		}
	}

	@Override
	protected int hash(String token) {//use the sum token's character's ascii values as a seed for a 

		int seed = 0;
		int len = token.length();
		int hashIndex;

		for(int i = 0; i < token.length(); i++){
			seed += (int)token.charAt(i)*(i+1);
		} //add the ascii values of the word to get the seed for the PRNG


		System.out.println(seed);

		if(len % 3 == 0){//How I decide how many digits to pull out
			hashIndex = seed%1000;
		}
		else if(len % 2 == 0){
			hashIndex = seed%100;
		}
		else{
			hashIndex = seed%10;
		}

		return hashIndex;
		
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
