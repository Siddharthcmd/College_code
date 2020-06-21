package javaproject;

import java.util.*;
import java.util.Map.Entry;


public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s3="aaddaassgghhijoppppp";
		HashMap<String,Integer> hash= new HashMap<>();
		int max=-99999;
		String maxKey="";
		String key;
		for(int i = 0; i<s3.length();i++) {
			key = s3.charAt(i) +"";
			if(hash.containsKey(key)) {
				hash.put(key,hash.get(key)+1);
					}else {
			   hash.put(key, 1);		
			}
		}
		//System.out.println(hash);
		//System.out.println(hash.entrySet());
		Set<Entry<String, Integer>> e = hash.entrySet();
		System.out.println(e);
		Collection<Integer> newVariable = hash.values();
		//System.out.println(newVariable);
		System.out.println(newVariable.size()); 
		//System.out.println(s2.charAt(0));
//	 HashMap<String,Integer> v1= hash.;
//		Map.Entry<String, Integer> entry;
		
		
//		for (Map.Entry<String, Integer> entry : hash.entrySet()) {
//			if(max < entry.getValue()) {
//				max = entry.getValue();
//				maxKey = entry.getKey();
//				
//			}
//			System.out.println(entry.getValue());
//		}
		//System.out.println(maxKey + ":" + max);
	}

}
