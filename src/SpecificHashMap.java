import java.util.List;
import java.util.LinkedList;

public class SpecificHashMap extends MyHashMap {

	private int length;

	@SuppressWarnings("unchecked")
	public SpecificHashMap() {
		this.length = 53;
		this.buckets = (LinkedList<String>[]) new LinkedList[length];
		for(int i=0; i<length;i++){
			this.buckets[i] = new LinkedList<String>();
		}
	}

	@Override
	protected int hash(String token) {
		int size = token.length();
		if(size == 2){
			if(token.equals("do")){
				return 0;
			}
			else if(token.equals("if")){
				return 1;
			}
		}
		else if(size ==3){
			if(token.equals("for")){
				return 2;
			}
			else if(token.equals("new")){
				return 3;
			}
			else if(token.equals("int")){
				return 4;
			}
			else if(token.equals("try")){
				return 5;
			}
		}
		else if(size ==4){
			if(token.equals("this")){
				return 6;
			}
			else if(token.equals("byte")){
				return 7;
			}
			else if(token.equals("else")){
				return 8;
			}
			else if(token.equals("case")){
				return 9;
			}
			else if(token.equals("enum")){
				return 10;
			}
			else if(token.equals("char")){
				return 11;
			}
			else if(token.equals("void")){
				return 12;
			}
			else if(token.equals("long")){
				return 13;
			}
		}
		else if(size ==5){
			if(token.equals("goto*")){
				return 14;
			}
			else if(token.equals("break")){
				return 15;
			}
			else if(token.equals("throw")){
				return 16;
			}
			else if(token.equals("short")){
				return 17;
			}
			else if(token.equals("catch")){
				return 18;
			}
			else if(token.equals("final")){
				return 19;
			}
			else if(token.equals("class")){
				return 20;
			}
			else if(token.equals("const")){
				return 21;
			}
			else if(token.equals("float")){
				return 22;
			}
			else if(token.equals("super")){
				return 23;
			}
			else if(token.equals("while")){
				return 24;
			}
		}
		else if(size ==6){
			if(token.equals("switch")){
				return 25;
			}
			else if(token.equals("assert")){
				return 26;
			}
			else if(token.equals("double")){
				return 27;
			}
			else if(token.equals("import")){
				return 28;
			}
			else if(token.equals("public")){
				return 29;
			}
			else if(token.equals("throws")){
				return 30;
			}
			else if(token.equals("return")){
				return 31;
			}
			else if(token.equals("static")){
				return 32;
			}
			else if(token.equals("native")){
				return 33;
			}
		}
		else if(size ==7){
			if(token.equals("default")){
				return 34;
			}
			else if(token.equals("package")){
				return 35;
			}
			else if(token.equals("boolean")){
				return 36;
			}
			else if(token.equals("private")){
				return 37;
			}
			else if(token.equals("extends")){
				return 38;
			}
			else if(token.equals("finally")){
				return 39;
			}
		}
		else if(size ==8){
			if(token.equals("abstract")){
				return 40;
			}
			else if(token.equals("continue")){
				return 41;
			}
			else if(token.equals("strictfp")){
				return 42;
			}
			else if(token.equals("volatile")){
				return 43;
			}
		}
		else if(size ==9){
			if(token.equals("transient")){
				return 44;
			}
			else if(token.equals("protected")){
				return 45;
			}
			else if(token.equals("interface")){
				return 46;
			}
		}
		else if(size ==10){
			if(token.equals("implements")){
				return 47;
			}
			else if(token.equals("instanceof")){
				return 48;
			}
		}
		else if(size ==11){
			return 49;
		}



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
		
		for(int i = 0; i < length; i++){
			System.out.println(buckets[i] + ": ");
			for(int q = 0; q < buckets[i].size(); q++;){
				System.out.println("   " + buckets[i].get(q));
			}
		}
	}
	
}
