public class Test{

	public int hash(String token) {

		int seed = 0; //because apparently that's a magical number
		int len = token.length();
		int hashIndex;

		seed += (int)token.charAt(0);
		seed += (int)token.charAt(len-1);
		seed *= (int)token.charAt(len-1)*65599;

		seed %= 149;

		hashIndex = seed;

		return hashIndex;
		

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