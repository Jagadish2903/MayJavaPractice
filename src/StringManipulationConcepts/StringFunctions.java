package StringManipulationConcepts;

public class StringFunctions {

	public static void main(String[] args) {

		
		String str="I_love_java_and+i am happy ";
		//to find the length 
		System.out.println(str.length());
		
		//to find the char at suing index
		System.out.println(str.charAt(2));
		
		//to find the index using char
		System.out.println(str.indexOf('o'));
		
		//to convert into uppercase:
		System.out.println(str.toUpperCase());
		
		//to convert to lowercase:
		System.out.println(str.toLowerCase());
		
		//to replace all with new letters or spaces -
		System.out.println(str.replaceAll("_", " "));
		
		//to remove blank spaces:
		System.out.println(str.replaceAll("\\s", ""));
		
		//to trim the starting and last spaces 
		System.out.println(str.trim());
		
		//to split :
		System.out.println(str.split("_")[0]);
		
		
				
		
	}

}
