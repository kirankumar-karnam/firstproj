package src.com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestRef {
	
	int ia =0;

	public static void main(String[] args) {
		try {
			/*Class c = Class.forName("src.com.TestRef");
			System.out.println(c.getName());
			System.out.println(c.getSimpleName());
			System.out.println(c.getModifiers());
			*/
			Map<String,String> map = new HashMap<String,String>();
			map.put("1", "one");
			//map.put("1", "one1");
			map.put("2", "one1");
			map.put("3", "one1");
			
			int i = 2/3;
			System.out.println(" dsa"+i);
			
			System.out.println(map.get("1"));
			Iterator<String> it = map.keySet().iterator();
			
			while(it.hasNext()){
				String value = it.next();
				String actValue = map.get(value);
				System.out.println("value "+value+" vl"+actValue);
				Map.Entry<String, String>  entry = it.ne
				System.out.println(it.);
				//map.remove(actValue);
				it.remove();
			}
			
			for(String s:map.keySet()){
				
			}
			
			System.out.println("99"+map);
			System.out.println("fgfygfhf");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("exception");
		}
	}

}
