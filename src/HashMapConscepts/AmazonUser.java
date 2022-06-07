package HashMapConscepts;

import java.util.HashMap;
import java.util.Map;

public class AmazonUser {
	
	
	
	
	
	public HashMap<String,String> getCredentials() {
		HashMap<String,String> map=new HashMap<String,String>();
		map.put("admin", "adminlogin");
		map.put("Jaggu", "Jaggulogin");
		map.put("Lav", "Lavlogin");
		map.put("Usha", "Ushalogin");	
		return map;
	}
	

	
	

	public static void main(String[] args) {
		AmazonUser Au=new AmazonUser();
		String cred=Au.getCredentials().get("Lav");
		System.out.println(cred);
		
	
		
		
	
		
		
	}

}
