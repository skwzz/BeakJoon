package programmers.kakao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class FailureRate {
	public static void main(String[] args) {
		int n = 4;
		int[] arr = new int[] {4, 4, 4, 4, 4};
		
		int[] nc = new int[n+2]; // 0 ~ 6
		float[] fr = new float[n+2];
		
		for(int i=0; i<arr.length; i++) {
			nc[arr[i]]++;
		}
 		int cnt = arr.length;
		for(int i=1; i<fr.length; i++) {
			fr[i] = (float)nc[i]/cnt;
			cnt -= nc[i];
		}
		HashMap<Integer, Float> hm = new HashMap<>();
		for(int i=1; i<fr.length; i++) {
			hm.put(i, fr[i]);
		}
		
		List<Map.Entry<Integer, Float>> list = new LinkedList<>(hm.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Integer, Float>>(){
			@Override
			public int compare(Entry<Integer, Float> o1, Entry<Integer, Float> o2) {
				int comparision = 0;
				if(o1.getValue()>o2.getValue()) {
					comparision = -1;
				}else if(o1.getValue()<o2.getValue()) {
					comparision = 1;
				}
                return comparision == 0 ? o1.getKey().compareTo(o2.getKey()) : comparision;
			}
		});
		
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0; i<list.size(); i++) {
			Entry<Integer, Float> o = list.get(i);
			if(o.getKey()!=0 && o.getKey()!= (n+1)) {
				al.add(o.getKey());
			}
		}
		
		int[] answer = new int[al.size()];
		for(int i=0; i<answer.length; i++) {
			answer[i]=al.get(i);
			System.out.print(answer[i]+" ");
		}
	}
}
