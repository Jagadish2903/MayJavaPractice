package HashMapConscepts;

import java.util.HashMap;
import java.util.Map;

public class Employee {

	public static void main(String[] args) {
					
			HashMap<String,String> map=new HashMap<String,String>();
			map.put("admin", "adminlogin");
			map.put("Jaggu", "Jaggulogin");
			map.put("Lav", "Lavlogin");
			map.put("Usha", "Ushalogin");	
			
			
			//foreach using lambda 
			map.forEach((k,v) -> System.out.println(k + " "+ v));
			
			//using foreach 
			for(Map.Entry<String, String> e:map.entrySet()) {
				System.out.println(e);
			}
			
		}
	}

