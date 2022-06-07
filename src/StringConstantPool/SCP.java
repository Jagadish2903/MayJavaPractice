package StringConstantPool;

public class SCP {

	public static void main(String[] args) {

		//Using String literals 
		String s1="Hello";
		String s2="Hello";
		String s3="Hello";
		
		//using new Keyword
		String s4=new String("Helo World "); //2 object created 1 in SCP and 1 in normal heap
		String s5=new String("Helo World ");
		
		System.out.println(s1==s2);//true //used to compare the memory address
		System.out.println(s4==s5);//false
		System.out.println(s4.equals(s5));//true //used t compare the values 
		
		
		
		T     ccccccccccccccccccccccccccccccccccccccccccccccccccc
	}

}
