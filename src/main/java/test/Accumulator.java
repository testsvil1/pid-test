package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Accumulator {

	Map<String, List<Object>> data = new HashMap<String, List<Object>>();

	public void put(String key, Object element) {
		List<Object> elements = data.get(key);
		if (elements == null) {
			elements = new ArrayList<Object>();
		}
		elements.add(element);
	}
	
	
	public List<Object> get(String key){
		return data.get(key);
	}
	
	public int elementsCount(String key){
		return data.get(key).size();
	}
	
	
}
