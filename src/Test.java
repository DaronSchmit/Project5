public class Test{

	public static int hash(String token) {
		
		// TODO: IMPLEMENT HASHING FUNCTION FOR GENERAL HASHMAP
		int length = 143;
		int totAscii = (int)token.charAt(0);
		int hashIndex;
		int len = token.length();

		for(int i = 1; i < len; i++){//generating an index
			totAscii += i*(int)token.charAt(i)*2;
		}
		hashIndex = totAscii;

		while(hashIndex > length){
			//System.out.println(hashIndex);
			hashIndex /= 10;
		}

		return hashIndex;
		
	}

	public static void main(String[] args){


		System.out.println(Test.hash("what"));
		System.out.println(Test.hash("is"));
		System.out.println(Test.hash("this"));
		System.out.println(Test.hash("shit"));
		System.out.println(Test.hash("doing"));


		String word = "this";
		for(int i = 0; i < word.length(); i++){
			System.out.println(word.charAt(i) + " " + (int)word.charAt(i));
		}
	}
}