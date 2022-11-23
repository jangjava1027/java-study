package org.study.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class MapSub{
	private String keyId;
	private String userId;
	
	public MapSub(String keyId, String userId) {
		super();
		this.keyId = keyId;
		this.userId = userId;
	}
	
	public String getKeyId() {
		return keyId;
	}
	public void setKeyId(String keyId) {
		this.keyId = keyId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}


public class MapEx2 {

	public static void main(String[] args) {
		
		HashMap<String, String> keyval=new HashMap<>();
		
		keyval.put("key1", "m1");
		keyval.put("key2", "m1");
		keyval.put("key3", "m3");
		keyval.put("key4", "m4");
		keyval.put("key5", "m5");
		
		Set<String> keys= keyval.keySet();
		 
		Iterator<String> iter=keys.iterator();
		
		while(iter.hasNext()) {
			String key=iter.next();
			String val=keyval.get(key);
			System.out.println("{"+key+":"+val+"}");
		}
		
		
		
		
		
		
		
		
		
	}
}
