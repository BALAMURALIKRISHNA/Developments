
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortValuesInAMapUsingComapartor {

	public static void main(String[] args) {
	String[] input = {"Area","Square","Square","True","Area","Man","Square"};
	HashMap<String,Integer> hm = new HashMap<String,Integer>();
	for(String str : input) {
		if(hm.containsKey(str)) {
			hm.put(str, hm.get(str)+1);
		}else {
			hm.put(str, 1);
		}
	}
	
    System.out.println(hm);
    
    List<Map.Entry<String, Integer>> ls= new ArrayList<Map.Entry<String, Integer>>();
    for(Map.Entry<String, Integer> e: hm.entrySet()) {
    	ls.add(e);
    }
    
    System.out.println(ls);
    Collections.sort(ls, new Comparator<Map.Entry<String, Integer>>() {
  
		@Override
		public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
			// TODO Auto-generated method stub
			if(o1.getValue() > o2.getValue()) {
				return 1;
			}else if(o1.getValue() < o2.getValue()) {
				return -1;
			}
			return 0;
		}
	});
    
    System.out.println(ls);
    
    
	}
	 
	
	}

