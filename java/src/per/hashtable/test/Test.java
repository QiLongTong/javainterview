package per.hashtable.test;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		System.out.println("hashTable采用Enumeration进行遍历");
		Hashtable<Integer,String> hashtable = new Hashtable<>();
		hashtable.put(1, "one");
		hashtable.put(2, "two");
		hashtable.put(3, "three");
		//HashTable采用Enumeration进行遍历
		Enumeration enumeration = hashtable.elements();
		while(enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
		System.out.println("hasnMap采用Iterator进行遍历");
		HashMap<Integer, String> hash= new HashMap<>();
		hash.put(9527, "唐伯虎");
		hash.put(9428,"石榴姐");
		Iterator i = hash.entrySet().iterator();
		while(i.hasNext()) {//i.next包含key,value
			Map.Entry entry = (Map.Entry)i.next();
			Object key = entry.getKey();
			Object val = entry.getValue();
	    System.out.println(key+"="+val);
//			System.out.println(i.next());
			
		}
	}
}
