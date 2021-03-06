package leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache extends LinkedHashMap<Integer,Integer>{

	private int cap;
	 
	 
	public LRUCache(int cap) {
		super(cap,(float) 0.75, true);
		this.cap = cap;
		
	}
	
	@Override
	protected boolean removeEldestEntry(java.util.Map.Entry eldest) {	
		if(this.size()>cap) {
			return true;
		}
		return false;
	}
	
	

	@Override
	public Integer get(Object arg0) {
		// TODO Auto-generated method stub
		return super.get(arg0);
	}

	public int get(int key) {
		if(this.containsKey(key))
		{
			return super.get(key);
		}
		return -1;
		
	}
	
	
	
}