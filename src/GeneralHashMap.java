import java.util.List;
import java.util.LinkedList;

public class GeneralHashMap extends MyHashMap {
	
	private int length;

	@SuppressWarnings("unchecked")//because that solved a problem
	public GeneralHashMap() {
		this.length = 139;// after testing, 139 became the magical number that game us the
		this.buckets = (LinkedList<String>[]) new LinkedList[length];
		for(int i=0; i<length;i++){
			this.buckets[i] = new LinkedList<String>();
		}//iterate through the array "buckets" and make all the indices into empty linked lists
	}

	@Override
	protected int hash(String token) {//do some math with ascii values of first and last characters and length, mod it, and viola! (see other comments for more detail)
	    
		int hashIndex = 0; 
		int len = token.length();

		hashIndex += (int)token.charAt(0) + len*(int)token.charAt(len-1);	//creates (hopefully) unique hashIndex
																			// using the ascii values of the 
																			// first and last characters along with 
																			// the length of the the word.

		hashIndex *= 65599;//multiply by 65599 because apparently that's a magical number (I would be inclined to agree)

		hashIndex %= length;//mod hashIndex so it will fit into the array
							// the pseudo-randomness of the hashIndex going into this
							// gives it a better shot at more random when modded
							// more randomness = more even distribution = more efficient = more points
		return hashIndex;	
	}

	@Override
	public void add(String token) {

		int index = hash(token);
		if(this.buckets[index].contains(token)){
			return;
		} //if the index already has the token, it does not add it to that index's linked list (duh)
		else{
			this.buckets[index].add(token);
			return; //otherwise it gets added (also duh)
		}
	}

	@Override
	public void display() {	
		for(int i = 0; i < length; i++){//iterate through array, print out all tokens in each index's linked list
			System.out.println(i + ": ");
			for(int q = 0; q < buckets[i].size(); q++){
				System.out.println("     " + buckets[i].get(q)); //spaces and "println"s make it look pretty (although very cumbersome)
			}
		}
	}

}
