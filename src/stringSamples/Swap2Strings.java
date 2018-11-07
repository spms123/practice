package stringSamples;

//Swap Two String Variables Without Using Third Variable in Java
public class Swap2Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swapString("java","concept");

	}

	private static void swapString(String string1, String string2) {
		// TODO Auto-generated method stub
		System.out.println("Before -- "+ "S1: "+ string1+ " || S2: "+ string2);
		
		string1 = string1.concat(string2);
		string2 = string1.substring(0,string1.length()-string2.length());
		string1 = string1.substring(string2.length());
		
		System.out.println("After -- "+ "S1: "+ string1+ " || S2: "+ string2);
	}

}
