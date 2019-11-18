package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Leet347_TopKFrequentElements {
	public static void main(String[] args) {
		int[] nums = {1, 1, 1, 2, 2, 3};
		int k = 2;
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i=0; i<nums.length; i++) {
			hm.put(nums[i], hm.getOrDefault((nums[i]), 0)+1);
		}
		
		Iterator it = hm.keySet().iterator();
		while(it.hasNext()) {
			int tmpK = (int)it.next();
			int tmpV = hm.get(tmpK);
			System.out.println(tmpK+" "+tmpV);
		}
		
		List<Integer> ret = sortHMap(hm);
		for(int i=ret.size()-1; i>=k; i--) {
			System.out.print(ret.remove(i));
		}
		System.out.println("");
		for(int i=0; i<ret.size(); i++) {
			System.out.print(ret.get(i)+" ");
		}
		
		
	}
	
	static List<Integer> sortHMap(HashMap hm) {
		List<Integer> al = new ArrayList<>();
		al.addAll(hm.keySet());
		
		Collections.sort(al, new Comparator<Object>(){
			public int compare(Object o1,Object o2) {
				Object v1 = hm.get(o1);
				Object v2 = hm.get(o2);
				return ((Comparable) v2).compareTo(v1);

			}
		});
		return al;
	}
}
